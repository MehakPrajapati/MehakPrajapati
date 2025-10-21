public class treecountsubseuence {
    public static void main(String[] args) {
        String ques = "abc";
        count_sub(ques, "");
        System.out.println("\n" + count_sub(ques, ""));
    }

    // static int count = 0;

    public static int count_sub(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        char ch = ques.charAt(0);
        int x = count_sub(ques.substring(1), ans);
        int y = count_sub(ques.substring(1), ans + ch);
        return x + y;
    }
}