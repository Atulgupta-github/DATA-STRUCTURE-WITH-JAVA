import java.util.Scanner;

public class Reverse_Array {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n =sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The  array is: ");
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("after reverseing");
        Reverse(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");

        }

    }
    public static void Reverse(int a[],int n){
        int temp;
        for(int i=0;i<n;i++){
            temp=a[i];
            a[i]=a[n-1];
            a[n-1]=temp;
            n--;

        }
    }
}
