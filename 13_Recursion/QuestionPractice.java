public class QuestionPractice {

    //problem 1
    public static void printOccurance(int arr[] , int idx, int key) {
        if(idx == arr.length) {
            return ;
        }
        if(arr[idx] != key) {
            printOccurance(arr, idx+1, key);
        } else {
            System.out.println("key is found on index " + idx);
            printOccurance(arr, idx+1, key);
        }
    }


    //problem 2
    static String[] str = {"zero", "one","two", "three", "four", "five", "six",
                            "seven", "eight","nine"
                        };


    public static void printstring(int arr[], int idx) {
        if(idx == arr.length) {
            return ;
        }

        System.out.print(str[arr[idx]] + " ");
        printstring(arr, idx+1);
        
    }

    //problem 3
    //-> find the length of the string using recursion

    public static int findStringLength(String str, int i) {
        if(i == str.length()) {
            return 0;
        }
        return 1 + findStringLength(str, i+1);

    }

    //problem 4

    


    // main method
    public static void main(String[] args) {
        //problem 1
        int arr[] = {3,2,4,5,6,2,7,2,2};
        System.out.println();
        printOccurance(arr, 0, 2);

        //problem 2
        System.out.println("\n");
        printstring(arr,0);

        //problem 3
        System.out.println("\n");
        System.out.println("length of string is " + findStringLength("amit", 0));
    }
}
