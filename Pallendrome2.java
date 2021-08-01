import java.util.Scanner;

public class Pallendrome2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=sc.nextLine();
        int start=0;
        int end=s1.length()-1;
        boolean ispal=true;
        while(start<end){
            if(s1.charAt(start)!=s1.charAt(end)){
                ispal=false;
                break;
            }
            start++;
            end--;
        }if(ispal==true){
            System.out.println("Yes this is pallendrome");
        }
        else
            System.out.println("NO this is not pallendrome");
    }
}
