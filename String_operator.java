import java.util.Locale;

public class String_operator {
    public static void main(String[]args){
        String str="HeeLLO";
        String str_1="helLO WORld";
        System.out.println(str.equalsIgnoreCase(str_1));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str_1.toUpperCase(Locale.ROOT));
        System.out.println("\n \n");
        System.out.println("String slicing:");

//        str.substring(start index,end index+1)
        System.out.println(str_1.substring(2,8));

    }
}
