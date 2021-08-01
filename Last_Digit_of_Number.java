import java.util.Scanner;
import java.lang.Math;
public class Last_Digit_of_Number {
    public static void main(String [] args){
        int r;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =sc.nextInt();
        n=Math.abs(n);
        r=n%10;
        System.out.println("The last digit of number is "+ r);

    }
}
