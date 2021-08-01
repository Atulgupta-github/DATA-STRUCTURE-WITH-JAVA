import java.util.Scanner;
import java.lang.Math;

public class Gcd_twonumbers {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x =sc.nextInt();
        System.out.println("Enter the second number:");
        int y =sc.nextInt();
        int i=1;
        while(i<=Math.min(x,y)){
            if(x % i==0 && y%i==0){
                System.out.println(i);

            }
            i++;
        }

    }
}
