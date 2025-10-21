public class sortinginsertion {
    public static void main(String[] args) {
        int [] arr = { 1 , 7 , 8 , 9 , 2};
        //insertlastelement(arr , arr.length - 1);
        sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void sort(int[] arr) {
        for(int i = 1; i<arr.length; i++){
            insertlastelement(arr, i);
        }
        
    }
    public static void insertlastelement(int [] arr , int i) {
        int item = arr[i];
        int j = i-1;
        while(j>=0 && arr[j] > item){
            arr[j+1] = arr[j];
            arr[j ] = item;
            j--;

        }
        // return j+1;
        
    }
}
