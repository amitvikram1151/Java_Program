public class swap {

    public static void exchange(int a, int b) { // only call by value
        int temp = a;
        a = b;
        b = temp;
        System.out.println("in swap function ");
        System.out.println("value of a : " + a + " "+ "value of b :  " + b);

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        exchange(a, b);
        System.out.println("in main function ");
        // its is printing a normal value because it doesnot change the actual value java only support call by value 
        System.out.println("value of a : " + a +" "+ "value of b :  " + b); 
    }
}
