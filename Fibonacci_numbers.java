//1, 1, 2, 3, 5, 8, 13 ....................

import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n(numbers of terms) ");
        int n =sc.nextInt();
        if(n==0){
            System.out.println(1);
        }
        else {
            if (n == 1) {
                System.out.println(1 + "");
                System.out.println(1);
            }
        }
        if(n>=2)
        {
            System.out.print(1+" ");
            System.out.print(1+" ");
            int a=1;
            int b=1;
            int i=2;
            while(i<=n){
                int c= a+b;
                System.out.print(c+" ");
                i++;
                a=b;
                b=c;

            }
        }
    }
}
