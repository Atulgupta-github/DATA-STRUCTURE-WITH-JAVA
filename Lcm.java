import java.util.Scanner;

public class Lcm {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x=sc.nextInt();
        System.out.println("Enter the Second number:");
        int y=sc.nextInt();
        int i=Math.max(x,y);
        while(i<= (x*y)){
            if(i%x==0 && i%y==0){
                break;
            }i++;
        }System.out.println("The LCM of two numbers is:"+i);
    }
}
