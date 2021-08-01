import java.util.Scanner;

public class Distinct_digit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(+a[i]+" ");
        }
        System.out.println(distinct(a,n));

    }
    public static int  distinct(int a[],int n){
        int count=1;
        for(int i=0;i<n;i++){
            int j=i+1;
            for( j=(i+1); j<n;j++){
                if(a[i]!=a[j]){
                    count=count+1;
                }
            }
        }return count;

    }
}
