import java.util.Scanner;
public class Nth_term_AP {
    public static void main(String [] args){
        int tn;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first term of AP \"a\"");
        int a =sc.nextInt();
        System.out.println("Enter the Common Difference of AP : \"d\" ");
        int d=sc.nextInt();
        System.out.println("Enter the the total no. of AP \" n \" ");
        int n=sc.nextInt();

        tn=a+(n-1)*d;
        System.out.println("The Nth term of AP is :"+ tn);
    }
}
