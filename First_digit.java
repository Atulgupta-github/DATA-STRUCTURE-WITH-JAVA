import java.util.Scanner;

public class First_digit {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        while(n>9){
            n=n/10;

        }System.out.println("The first digit of this number: " +n);



    }
}
