public class BitManipulation {
    public static void main(String[] args) {
        // Binary AND (&)
        System.out.println((5 & 6));
        //Binary OR (|)
        System.out.println((5 | 6));
        //Binary XOR (^)
        System.out.println((5 ^ 6));
        //Binary NOT (~)
        System.out.println((~5));

        //Binary Left Shift(<<)
        // formula a << b = (a * 2^b)
        System.out.println((5 << 2));

        //Binary Right Shift(>>)
        // formula a >> b = (a / 2^b)
        System.out.println((6 >> 1));
    }

}
