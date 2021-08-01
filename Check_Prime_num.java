/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.Math;
class XYZ {


    static boolean isPrime(int n)
    {
        if(n==1)
            return false;

        for(int i=2; i<Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        System.out.println(n+" is prime");

        return true;
    }

    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();

        System.out.println(isPrime(n));

    }
}