
public class stringreverseword {
    public static void main(String[] args) {
        String s = "the sky is   blue";
        s = s.trim();
        System.out.println(s);
        String[] arr = s.split(" +");
        // System.out.println(Arrays.toString(arr));
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans = ans + arr[i] + " ";
        }
        ans.trim();
        System.out.println(ans);
    }
}
