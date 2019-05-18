class Min{
    public static int minimum(String s1, String s2){
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for(int i = s1.length() - 1; i >= 0; i--){
            dp[i][s2.length()] = dp[i+1][s2.length()] + s1.codePointAt(i);
            //System.out.println("S1: "+dp[i][s2.length()]);
        }
        for (int j = s2.length() - 1; j >= 0; j--) {
            dp[s1.length()][j] = dp[s1.length()][j+1] + s2.codePointAt(j);
            //System.out.println("S2: "+dp[s1.length()][j]);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.min(dp[i+1][j] + s1.codePointAt(i), dp[i][j+1] + s2.codePointAt(j));
                }//end if/else
            }// end j for loop
        }// end i for loop
        
        //prints table
        for(int x = 0; x < dp.length; x++){
            for(int y = 0; y < dp[x].length; y++){
                System.out.print(dp[x][y]+" ");
            }
            System.out.println();
        }
        return dp[0][0];
    }
    public static void main(String[] args){
        String s1 = "sea";
        String s2 = "eat";

        int x = minimum(s1, s2);
        System.out.println("Result: "+ x);
    }
}
