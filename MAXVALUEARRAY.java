public class MAXVALUEARRAY {
    public static void maximum(int [] arr){
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }System.out.println(max);

    }

    public static void main(String [] args){
        int [] arr={12,434,546,32,343,43};
        maximum(arr);
    }













}
