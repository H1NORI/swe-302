public class Enemy {
    public int health;
    public int attackPower;

    //@ invariant health >= 0;
    //@ invariant attackPower >= 0;

    public Enemy(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Player p) {
        p.takeDamage(attackPower);
    }
}
