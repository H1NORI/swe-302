public class Item {
    public String name;
    public int value;

    //@ invariant value >= 0;
    //@ invariant name != null;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
