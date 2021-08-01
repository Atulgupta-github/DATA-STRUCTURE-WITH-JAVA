import java.util.Scanner;
import java.util.*; ;
public class Calculator {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        double result;

        while(true) {
            System.out.println("Choose Your operation :");
            System.out.println("1=Addition");
            System.out.println("2=Substraction");
            System.out.println("3=Multypication");
            System.out.println("4=devision");

            char operation = sc.next().charAt(0);
            System.out.println("Enter the first Number :");
            int x = sc.nextInt();
            System.out.println("Enter the second  Number :");
            int y = sc.nextInt();


            if (operation == '1') {
                result = x + y;
                System.out.println("The Addition of two number is:" + result);

            }
            if (operation == '2') {
                result = x - y;
                System.out.println("The Substraction of two number is:" + result);

            }
            if (operation == '3') {
                result = x * y;
                System.out.println("The multiply of two number is:" + result);

            }
            if (operation == '4') {
                result = x / y;
                System.out.println("The Division  of two number is:" + result);

            }

        }







    }
}
