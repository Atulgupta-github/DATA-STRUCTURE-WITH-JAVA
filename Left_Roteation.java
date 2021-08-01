import java.util.Scanner;//p

public class Left_Roteation {
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
        System.out.println("AFTER rotation");
        Rotation(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }





    public static void Rotation(int a[],int n){
        int temp;
        temp=a[0];
        for(int i=1;i<n;i++){

            a[i-1]=a[i];

        }a[n-1]=temp;
    }





}
