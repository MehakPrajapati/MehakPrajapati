
import java.util.Scanner;

public class secDrray {
    public static void main(String[] args) {
        // input output array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // for row
        int m = sc.nextInt();                    // for column
        int [] [] arr = new int [n] [m];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j <arr[0].length; j++){
                arr[i] [j] = sc.nextInt();
            }
        }
        display(arr);

    }
    public static void  display(int [][] arr) {
          for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
             System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
        
    }
}
