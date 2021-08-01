import com.sun.deploy.util.SyncAccess;
import java.lang.*;
import java.util.Scanner;

public class String_Reverse {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println(str);
        reverse(str);
    }
    static void reverse(String str){
        String temp="";
        for(int i=(str.length()-1);i>=0;i--){
//            char ch=str.charAt(i);
            temp=temp+str.charAt(i);

        }
        System.out.println(temp);
    }
}
