public class Non_primitive_datatype {   //  non primitive datatype class
    int x;
    int y;

}
class Test{                       // non primitive data type
    public static void main(String [] args){
        Non_primitive_datatype p= new Non_primitive_datatype(); // creat object
        p.x=10;
        p.y=20;
        System.out.println(p.x+ p.y);
        Non_primitive_datatype p2=p;
        p2.x=30;
        System.out.println(p.x);
        System.out.println(p2.x);



    }
}