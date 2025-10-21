public class sortselection {
    public static void main(String[] args) {
        int [] arr = { 4 , -1, 5,3,2,1 ,7};
       // System.out.println(min_form_ith_index(arr,2));
       sort(arr);
       for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void sort(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            int min = min_form_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static int  min_form_ith_index(int[] arr , int idx) {
        int min = idx;
        for(int i = idx+1; i<arr.length;i++){
if(arr[i]<arr[min]){
    min = i;
}
        }
        return min;
    }
}
