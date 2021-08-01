public class Delition_array {
    public static void main(String [] args){
        int a[]={1,2,3,4,5,6};
        int n=6;
        System.out.println("befor deletion");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("After delition");
        int idx=2;


        delete(a,n,idx);
        for(int i=0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
    }


    public static void delete(int a[],int n,int idx ){

        for(int i=idx;i<n-1;i++){
            a[i]=a[i+1];

        }



    }
}
