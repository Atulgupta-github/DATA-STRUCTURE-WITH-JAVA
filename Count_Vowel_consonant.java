import java.util.Locale;
import java.util.Scanner;

public class Count_Vowel_consonant {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        Count_vowel_consonant(str);

    }





    public static void Count_vowel_consonant(String str){
        int count_v=0;
        int count_c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            str=str.toLowerCase(Locale.ROOT);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                count_v=count_v+1;
            }
            else if(ch>='a'&& ch<='z'){
                count_c=count_c+1;
            }
        }System.out.println("the consnant is :"+ count_c+ "and the vowel is"+count_v);
        if(count_v>count_c){
            System.out.println("vowel is maximum");
        }else{
            if(count_c>count_v){
                System.out.println("consonat is maximum");
            }
            else
                System.out.println("equal");
        }

    }
}
