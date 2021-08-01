import java.util.Scanner;

public class Pallendromstring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);

        }System.out.println(str1);
        if(str==str1){
            System.out.println("This is pallendrom string");
        }
        else{
            System.out.println("This is not pallendrom string");
        }
    }
}
