public class TrappedWater {
    public static void trappedWater(int height[]) {
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];

        for(int i = 0; i < height.length; i++) {
            leftmax[i] = (i == 0) ? height[i] : Math.max(leftmax[i-1], height[i]);
        }

        for(int j = height.length - 1; j>= 0; j--) {
            rightmax[j] = (j == height.length - 1) ? height[j] : Math.max(height[j], rightmax[j+1]);
        }

        int trappedwater = 0;

        for(int i = 0; i < height.length; i++) {
            trappedwater += (Math.min(leftmax[i], rightmax[i]) - height[i]);
        }

        System.out.println("trapped water is : " + trappedwater);
    }


    public static void optimizedTrappedWater(int height[]) {
        int trappedwater = 0;
        int left = 0;
        int right = height.length-1;
        int leftmax = 0;
        int rightmax = 0;

        while(left < right) {
            if(height[left] <= height[right]) {
                if(height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    trappedwater += (leftmax - height[left]);
                }
                left++;
            } else {
                if(height[right] >= rightmax ) {
                    rightmax = height[right];
                } else{
                    trappedwater += (rightmax - height[right]);
                }
                right--;
            }
        }
        System.out.println("trappedwater is : " + trappedwater);

    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        trappedWater(height);
        optimizedTrappedWater(height);
    }
}
