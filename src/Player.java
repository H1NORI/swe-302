import java.util.ArrayList;
import java.util.List;

public class Player {
    public int health;
    public int maxHealth;
    public int x, y;
    public List<Item> inventory;
    public int inventoryLimit = 10;

    //@ requires max > 0 && max < Integer.MAX_VALUE;
    //@ ensures this.health == max;
    //@ ensures this.maxHealth == max;
    public Player(int max) {
        this.maxHealth = max;
        this.health = max;
        this.inventory = new ArrayList<>();
    }

    //@ requires damage >= 0;
    //@ ensures health == (\old(health) < damage ? 0 : \old(health) - damage);
    //@ assignable health;
    public void takeDamage(int damage) {
        if (this.health < damage) {
            this.health = 0;
        } else {
            this.health = this.health - damage;
        }
    }

    //@ requires heal > 0;
    //@ requires health + heal < Integer.MAX_VALUE;
    //@ ensures health == \old(health) + heal || health == maxHealth;
    //@ requires health < Integer.MAX_VALUE;
    //@ assignable health;
    public void heal(int heal) {
        if (this.health + heal > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = this.health + heal;
        }
        // this.health = Math.min(maxHealth, this.health + heal);
    }

    //@ requires item != null;
    //@ ensures inventory.contains(item);
    //@ assignable inventory.*;
    public void pickUpItem(Item item) {
        inventory.add(item);
    }
}
