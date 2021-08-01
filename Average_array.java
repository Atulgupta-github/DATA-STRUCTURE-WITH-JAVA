public class Average_array {

    public static void main(String [] args){
        int sum=0;
        double avrg;

        int arr []={121,2,323,435,66,76,86};
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        avrg=sum/arr.length;
        System.out.println(avrg);


    }
}
