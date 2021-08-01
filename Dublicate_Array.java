import java.util.Scanner;

public class Dublicate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The  array is: ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("After remove dubplication number of term");
        int x= dublicate(a,n);
        System.out.println(x);
    }







    public static int dublicate(int a[],int n){
        int temp[]=new int[n];
        temp[0]=a[0];
        int res=1;
        for(int i=1;i<n;i++){
            if(a[i]!=temp[res-1]){
                temp[res]=a[i];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            a[i]=temp[i];
        }return res;
    }
}
