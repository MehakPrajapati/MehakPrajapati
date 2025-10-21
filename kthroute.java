public class kthroute {
    public static void main(String[] args) {
        int n = 143;
        int k = 3;
        System.out.println(kthroute(n, k));
    }
    public static int  kthroute(int n , int k) {
        int lo = 1;
        int high = n;
        int ans = 0;
        while(lo<=high){
            int mid = (lo + high)/2;
            if(Math.pow(mid, k)<= n){
                ans = mid;
                lo = mid + 1 ;

            }else{
                high = mid - 1;
            }
        }
        return ans;

    }
}
