import java.util.Scanner;
public class Largest_number {
    public static void main(String [] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the Second number:");
        b=sc.nextInt();
        System.out.println("Enter the third number:");
        c=sc.nextInt();
        if(a>=b && a >=c) {
            System.out.println(a + "is greatest");
        }
        else {
            if (b > a && b >= c) {
                System.out.println(b + "is greatest");
            } else
                System.out.println(c + "is greatest");

        }
        
    }
}
