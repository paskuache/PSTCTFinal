import java.util.*;

class Perfect{
    public static int numSquares(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int x = 0; x <= n; x++){
            for(int y = 1; x + y * y <= n; y++){
                dp[x + y * y] = Math.min(dp[x + y * y], dp[x] + 1);
                System.out.print(dp[x + y * y]+"\t");
            }//end y for loop
            System.out.println();
        }//end x for loop
        return dp[n];
    }//end numSquares

    public static void main(String[] args){
        int res = numSquares(9);
        System.out.println("Result: "+res);
    }
}//end Perfect