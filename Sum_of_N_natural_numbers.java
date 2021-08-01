import java.util.Scanner;
public class Sum_of_N_natural_numbers {
    public static void main(String [] args) {
        double Sn;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the the total no.  \" n \" ");
        int n = sc.nextInt();

        Sn = n * (n + 1) / 2;
        System.out.println("The Sum of  N Ntural nunbers  is :" + Sn);
    }
}
