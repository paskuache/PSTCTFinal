class Stone{
    public boolean stone(int[] piles){
        int n = piles.length;

        int[][] dp = new int[n+2][n+2];
        for(int x = 1; x <= n; x++){
            for(int y = 0; y + x <= n; y++){
                int j = y + x - 1;
                int parity = (j + i + n)%2;

                if(parity == 1)
                    dp[y+1][j+1] = Math.max(pies[y] + dp[y+2][j + 1], piles[j] + dp[y + 1][j]);
                else
                    dp[y+1][j+1] = Math.min(-piles[y] + dp[y+2][j+1], -piles[j] + dp[y+1][j]);
            }//end y for loop
        }//end x for loop
        return dp[1][n] > 0;
    }//end stone

    public static void main(String[] args){
        int[] pile = {5, 3, 4, 5};

        boolean win = stone(pile);
        System.out.println("Win: " + win);
    }
}//end class Stone