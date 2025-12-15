
public class print_reverse {
    public static void main(String[] args) {
        int n = 10998723;
        while( n > 0 ) {
            int lastdigit = n % 10;// for finding a remainder
            System.out.print(lastdigit );
            n/=10;// n = n/10; // for removing a last digit
        }
        System.out.println();

    }
    
}
