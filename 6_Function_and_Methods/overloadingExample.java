public class overloadingExample {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // one way
        int a = 3,  b = 5,  c = 6; 
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));  
        
        // another way
        System.out.println(sum(2,4));
        System.out.println(sum(4,5,5));
    }
    
}
