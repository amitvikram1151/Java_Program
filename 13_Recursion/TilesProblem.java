public class TilesProblem {
    public static int tilingProblem(int n ) { // 2 * n (floor size)
        if(n == 0 || n == 1) {
            return 1;
        }

        //vertical titing
        int fnm1 = tilingProblem(n-1);

        //horizontal problem
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

        // int one line
        // return tilingProblem(n-1) + tiltingProblem(n-2);
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
