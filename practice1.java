import java.util.*;

public class practice1{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();

        if( num <= 1){
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;
        for( int i = 2; i <= num / 2; i++){
            if( num % i == 0){
                isPrime = false;
                break;
            }
        }
        if( isPrime){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}