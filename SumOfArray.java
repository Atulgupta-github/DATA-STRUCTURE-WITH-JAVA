public class SumOfArray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr =  new int [4];
        arr[0]=15;
        arr[1]=656;
        arr[2]=45;
        arr[3]=989;
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}