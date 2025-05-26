public class Enemy {
    public int health;
    public int attackPower;

    //@ requires health > 0;
    //@ requires attackPower >= 0;
    public Enemy(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    //@ requires player != null;
    //@ requires attackPower >= 0;
    public void attack(Player player) {
        player.takeDamage(attackPower);
    }
}
