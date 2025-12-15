
public class largestSmallest {

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < number.length;i++) {
            if(number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<number.length; i++) {
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static int getSecondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        //return secondLargest;
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static int getThirdLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                 thirdLargest = secondLargest;
                 secondLargest = largest;
                 largest = arr[i];

            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];

            }
            else if(arr[i] > thirdLargest && arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }
        // return thirdLargest;
        return thirdLargest == Integer.MIN_VALUE ? -1 : thirdLargest;

    }


    public static void main(String[] args) {
        int arr[] = {-1,-2, -3, 5,9, 14, -198, 21};
        System.out.print("largest is : " + getLargest(arr));
        System.out.println();
        System.out.print("smallest is : " + getSmallest(arr));
        System.out.println();
        System.out.print("second largest is : " + getSecondLargest(arr));
        System.out.println();
        System.out.print("third largest is : " + getThirdLargest(arr));
        System.out.println();
    }
}
