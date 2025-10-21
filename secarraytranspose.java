public class secarraytranspose {
    public static void main(String[] args) {
        int [] [] arr = {  {  2, 3 , 1,4},
                           {5 , 6 , 7 , 8 },
                           {8 , 12, 11 , 10}, 
                           {16 , 15 , 14 , 13} 
                    };
                    transpose(arr);
                    for(int i = 0; i<arr.length; i++){
                        for(int j = 0; j<arr[0].length; j++){
                            System.out.print(arr[i] [j]+" ");
                        }
                        System.out.println();
                    }

    }
    public static void transpose(int[] [] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int temp = arr[i] [j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
