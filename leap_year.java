import java.util.Scanner;
public class leap_year {
    public static void main(String [] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = sc.nextInt();
        if(year%4==0 && year %100!=0){
            System.out.println("this is leap year ");
        }
        else {
            if(year%400==0) {
                System.out.println("this is leap year");
            }
            else
                System.out.println("THIS IS NOT LEAP YEAR");
        }


    }
}
