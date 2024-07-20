package GCD;
import java.util.*;
public class bruteapp {

    static int gcd(int a , int b ){
        // int k=0;
        // if(a<b){
        //     k=a;
        // }else{
        //     k=b;
        // }

        // for(int i=k; i>=1; ){
        //     if(a%k==0 && b%k==0){
        //         return i;
        //     }
        //     return 1;
        // }
        // return k;

        while(a % b != 0){
            int rem = a%b;
            a = b;
            b= rem;
        }
        return b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" enter a ");
            int a = sc.nextInt();
            System.out.println(" enter b ");
            int b = sc.nextInt();
             System.out.println(" gcd " + gcd(a, b));
        }
    }
    
}
