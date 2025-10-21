public class recursionarrays {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 4, 5, 7 };
        int item = 5;
        System.out.println(index(arr, item, 0));
    }

    public static int index(int[] arr, int item, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == item) {
            return i;
        }
        return index(arr, item, i - 1);
    }
}
