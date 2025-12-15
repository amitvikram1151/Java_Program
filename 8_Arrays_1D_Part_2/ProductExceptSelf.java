public class ProductExceptSelf {
    public static void poductExceptSelf(int arr[]) {
        int brr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int product = 1;
            for(int j = 0; j < arr.length; j++) {
                if(i == j) continue;
                product *= arr[j];
            }
            brr[i] = product;
        }
        for(int nums : brr) {
            System.out.print(nums + " ");
            
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        poductExceptSelf(arr);
    }
}
