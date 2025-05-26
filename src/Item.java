public class Item {
    public String name;
    public int value;

    //@ requires value >= 0;
    //@ requires name != "";
    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
