public class GameWorld {
    public int width, height;

    //@ invariant width > 0 && height > 0;

    public GameWorld(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /*@ requires 0 <= x && x < width;
      @ requires 0 <= y && y < height;
      @ ensures \result;
      @*/
    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
