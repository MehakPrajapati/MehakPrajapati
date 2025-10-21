package CBCLASS;

public class slidingwindoq {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 3, 5, 6, 3, 6, 3, 2, 1 };
        int k = 3;

    }

    public static int max(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int ans = sum;
        for (int i = k; i < arr.length; i++) {
            // grow
            sum = sum + arr[i];
            // shrink
            sum = sum - arr[i];
            // ans cal
            ans = Math.max(ans, sum);

        }
        return ans;
    }
}
