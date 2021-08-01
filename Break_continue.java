import java.util.Scanner;

import java.util.Scanner;
public class Break_continue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<5) {
            System.out.println("Enter the value of x:");
            int x_value = sc.nextInt();
            System.out.println("Enter the value of y:");
            int y_value = sc.nextInt();
            System.out.println("("+x_value + ","+y_value+")");
            if(y_value==0)
                continue;

            System.out.println("THE VALUE OF X/Y IS:"+ x_value/y_value);
            i++;
        }





    }

}
