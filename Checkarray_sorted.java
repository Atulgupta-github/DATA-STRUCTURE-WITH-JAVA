import java.util.Scanner;

public class Checkarray_sorted {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        boolean ans=is_sorted(arr);
        if(ans==true){
            System.out.println("yes");
        }
        else
            System.out.println("no");

    }

    public static boolean is_sorted(int arr[]){
        for(int i=1;i<arr.length;i++) {
            if (arr[i] < arr[i-1]){
                return false;
            }
        }return true;
    }

}
