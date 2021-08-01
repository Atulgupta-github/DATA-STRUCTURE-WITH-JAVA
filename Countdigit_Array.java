import java.util.Scanner;

public class Countdigit_Array {
    public static void main(String[] args){
        int arr []={12,43,54,6,56,67,6767,2,1};
        count_digit(arr);

    }


    public static void count_digit(int arr[]){
        int count=0;
        for(int i=0;i< arr.length;i++){
            count=count+1;
        }
        System.out.println(count);
    }









}
