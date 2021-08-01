import java.lang.Math;
import java.util.Scanner;


public class Prime_Fctorization {
    public static boolean is_Prime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;

    }


    public static void primefactor(int n){
        for(int i=2;i<=n;i++){
            if(is_Prime(i)){
                int x=i;
                if(n%i==0){
                    System.out.print(i+ " ");
                }
            }
        }
    }




    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
//        System.out.println(is_Prime(n));
        primefactor(n);
    }



}
