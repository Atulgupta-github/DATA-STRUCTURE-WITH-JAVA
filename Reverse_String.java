import java.util.Scanner;

public class Reverse_String {
    public static void main(String [] args){
//        StringBuilder sb1=new StringBuilder(System.in);
        Scanner sc=new Scanner(System.in);
        String str2="";
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int i=str.length()-1;
        for(i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);

    }
}
