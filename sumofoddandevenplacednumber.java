
import java.util.Scanner;

public class sumofoddandevenplacednumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddno = 0;
        int evenno = 0;
        int position = 0;
        while(n>0){
            int rem = n%10;
            if(position %2 == 0){
           oddno = oddno + rem;
        
            }else{
            evenno = evenno + rem;
        }
           n = n/10;
           position++;
        }
        System.out.println(oddno);
        System.out.println(evenno);
    }
}
