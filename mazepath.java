public class mazepath {
    public static void main(String[] args) {
        int n = 3;

        int m = 3;
        printpath(0,0,n-1,m-1,"");

    }

    // cr = current row , cc = current col , er = end row , ec = end col ,
    public static void printpath(int cr, int cc, int er, int ec, String ans) {
        if (cr == er && cc == ec) {
            System.out.println(ans);
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }
        printpath(cr, cc + 1, er, ec, ans + "h");
        printpath(cr + 1, cc, er, ec, ans + "i");
    }
}
