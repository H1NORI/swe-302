public class Player {
    public int health;
    public int maxHealth;
    public int x, y;
    public List<Item> inventory;

    //@ invariant 0 <= health && health <= maxHealth;
    //@ invariant inventory != null;

    /*@ requires max > 0;
      @ ensures this.health == max;
      @ ensures this.maxHealth == max;
      @*/
    public Player(int max) {
        this.maxHealth = max;
        this.health = max;
        this.inventory = new ArrayList<>();
    }

    /*@ requires damage >= 0;
      @ ensures health == \old(health) - damage || health == 0;
      @ assignable health;
      @*/
    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    /*@ requires heal > 0;
      @ ensures health == \old(health) + heal || health == maxHealth;
      @ assignable health;
      @*/
    public void heal(int heal) {
        this.health = Math.min(maxHealth, this.health + heal);
    }

    /*@ requires item != null;
      @ ensures inventory.contains(item);
      @*/
    public void pickUpItem(Item item) {
        inventory.add(item);
    }
}
