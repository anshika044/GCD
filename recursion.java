package GCD;
import java.util.*;
public class recursion {

    static int gcd(int x ,int y){
        if(y==0){
            return x;
        
        }
        return gcd(y, x%y);

    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" enter x ");
            int x = sc.nextInt();
            System.out.println(" enter y ");
            int y = sc.nextInt();
            System.out.println(gcd(x, y));
            System.out.println(" lcm is " + x*y/gcd(x, y));

    }
    
    }
}