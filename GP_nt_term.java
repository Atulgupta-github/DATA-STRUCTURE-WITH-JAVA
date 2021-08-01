import java.util.Scanner;
import java.lang.Math;
public class GP_nt_term {
    public static void main(String [] args){
        double tr;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first term \"a\"");
        int a =sc.nextInt();
        System.out.println("Enter the common Ratio : \"r\"");
        float r=sc.nextFloat();
        System.out.println("Enter the totel term in GP \" n\" : ");
        int n= sc.nextInt();
        tr= a* (Math.pow(r,(n-1)));
        System.out.println("The Nth term of GP is :" +tr);

    }
}
