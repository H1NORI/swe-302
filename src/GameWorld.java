public class GameWorld {
    public int width;
    public int height;

    //@ requires width > 0;
    //@ requires height > 0;
    public GameWorld(int width, int height) {
        this.width = width;
        this.height = height;
    }


    //@ assignable \nothing;
    /*@ pure @*/ public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}