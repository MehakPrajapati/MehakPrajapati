public class recursionsorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 9 };
        System.out.print(pd(arr, 0));
    }

    public static int pd(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return pd(arr, i + 1);
    }
}
