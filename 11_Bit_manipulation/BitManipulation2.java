//get and set the bits 

public class BitManipulation2 {

    public static int getIthBit(int n , int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0 ) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        // //method 1
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // }else {
        //     return setIthBit(n, i);
        // }

        //method 2
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static int clearLastBit(int n, int i) {
        int bitMask = -1 << i;
        return n & bitMask;
    }
    public static int clearRangeBit(int n, int i, int j) {
        int a = -1 << j+1;
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    // check the is the powerof2
    public static Boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
       // System.out.println(getIthBit(10, 3));
        //System.out.println(setIthBit(6, 3));
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearLastBit(15, 2));
        System.out.println(clearRangeBit(10, 2, 4));

        //for the checking the power of two
        System.out.println(isPowerOfTwo(8));
    }
}
