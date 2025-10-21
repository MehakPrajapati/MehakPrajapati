package CBCLASS;

public class genric {
    public static void main(String[] args) {
        Integer[] arr = { 10, 20, 30, 40, 50 };
        display(arr);
        String[] arr2 = { "rra", "hu" };
        display(arr2);
    }

    public static <T> T get(T[] arr) { // integer value return krne keliye hai
        return arr[0];
    }

    public static <T> void display(T[] arr) { // T = sue for both display , string and arrays dono keliye hai
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}