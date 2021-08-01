import java.util.Scanner;
public class Divisors_of_num {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("The all divisors of Number: ");
        int i=1;
        while(i<=n){
            if(n%i==0){

                System.out.println(i);
            }
            i++;
        }
    }
}
