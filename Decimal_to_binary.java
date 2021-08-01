import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str="";
        String str1="";
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int r;
        while(n>0){
            r=n%2;
            n=n/2;
            str =str+ r;

        }
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }System.out.println("The binary form of this number is: "+str1);



    }
}
