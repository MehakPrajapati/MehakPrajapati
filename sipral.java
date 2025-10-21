



public class sipral {
    public static void main(String[] args) {
        int [] [] matrix = {{1,4,7,11,15},{2,5,8,12,19} , {3,6,9,16,22} , {10,13,14,17,24} , {18,21,23,26,30}};
        print(matrix);
    }
    public static void print(int [] [] matrix) {
        int minrow = 0, maxrow = matrix.length-1 , mincol = 0, maxcol= matrix[0].length-1;
        int c = 0;
        int totalelement = matrix.length * matrix[0].length;
        while(c < totalelement){
        for(int i = mincol; i<= maxcol  && c < totalelement; i++){
            System.out.print(matrix[minrow][i] + " ");
            c++;
   }
   minrow++; 
        for(int i = minrow; i<= maxrow && c < totalelement; i++){
            System.out.print(matrix[maxcol][i] + " ");
            c++;
   }
   maxcol--;
   for(int i =  maxcol ; i>= mincol  && c < totalelement; i--){
    System.out.print(matrix[maxrow][i] + " ");
    c++;
   }
   maxrow--;
   for(int i = maxrow ; i>= minrow && c < totalelement; i--){
    System.out.print(matrix[i][mincol] + " ");
    c++;
   }
   mincol++;
}
}
}
