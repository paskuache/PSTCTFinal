class Stone{
    public boolean stone(int[] piles){
        int n = piles.length;

        int[][] dp = new int[n+2][n+2];
        for(int x = 1; x <= n; x++){
            for(int y = 0; y + x <= n; y++){
                int j = y + x - 1;
                int parity = (j + y + n)%2;
                System.out.println("Parity: "+ parity);
                if(parity == 1){
                    dp[y+1][j+1] = Math.max(piles[y] + dp[y+2][j + 1], piles[j] + dp[y + 1][j]);
                    System.out.println("Parity == 1:" + dp[y+1][j+1]);
                }else{
                    dp[y+1][j+1] = Math.min(-piles[y] + dp[y+2][j+1], -piles[j] + dp[y+1][j]);
                    System.out.println("Parity != 1:" + dp[y+1][j+1]);
                }
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