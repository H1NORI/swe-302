public class GameEngine {
    public GameWorld world;
    public Player player;

    //@ requires world != null;
    //@ requires player != null;
    public GameEngine(GameWorld world, Player player) {
        this.world = world;
        this.player = player;
    }

    //@ requires world.isValidPosition(x, y);
    //@ ensures player.x == x && player.y == y;
    //@ assignable player.x, player.y;
    public void movePlayerTo(int x, int y) {
        player.x = x;
        player.y = y;
    }
}
