public class Main {
    public static void main(String[] args) {
        Player p = new Player(100);
        Item sword = new Item("Sword", 10);
        p.pickUpItem(sword);
        p.takeDamage(20);
        p.heal(10);
    }
}
