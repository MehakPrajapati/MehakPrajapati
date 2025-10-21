package CBCLASS;

public interface interfacedemo {
    public static final int x = 9;

    /// fainal = value does not change always 

    public void push(int item);

    public int pop();

    public static int get() {
        return 0;

    }

    default int get2() {
        return 0; // for java 9
    }

    private void fun() {
        // for javva 9
    }
}
