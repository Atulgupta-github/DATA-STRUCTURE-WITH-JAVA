import java.util.Scanner;

class Main {

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printFactors(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(x+" ");
                    x=x*i;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        printFactors(n);
    }
}
