public class binarysearch {
    public static void main(String[] args) {
        int [] arr = {2 , 3, 4,5,6,7,9};
int item = 7;
System.out.println(search[] arr, int item);
    }
    public static int  search(int[] arr) {
        int lo = 0;
        int high = arr.length-1;
        while(lo<=high){
           int  mid = (lo+high)/2;
           if(arr[mid] == item){
            return mid;
           }else if(arr[mid]> item){
            high = mid-1;
           }else{
            lo = mid +1;
           }
        }
        return  -1;
    }
}
