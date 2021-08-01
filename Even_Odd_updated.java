import java.util.Scanner;
public class Even_Odd_updated {
    public static void main(String [] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        n = sc.nextInt();

        if (n % 2 == 0) {
            if(n>0){
                System.out.println("Possitive even number");
            }
            else
                System.out.println("Negative Even Number");



        }
        else {
            if(n>0){
                System.out.println("Possitive Odd Nmber");
            }
            else
                System.out.println("Negative odd number");

        }




    }
}
