import java.io.*;
class MSFP{

    public static int minFPS(int a[][]){
        int n = a.length;
        for(int x = n - 2; x >=0; x--){
            for(int y = 0; y < n; y++){
                //Starts filling cache array 
                //starting with the middle column
                int best = a[x + 1][y];
                if(y > 0)
                    best = Math.min(best, a[x+1][y-1]);
                if(y + 1 < n)
                    best = Math.min(best, a[x+1][y+1]);
                a[x][y] = a[x][y] + best;
                System.out.print(a[x][y]+"\t");
            }//end y for loop
            System.out.println();
        }//end x for loop

        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            result = Math.min(result, a[0][i]);
        }//end i for loop
        return result;
    }//end minFPS

    public static void main(String[] args){
        int a[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println("Result: " +minFPS(a));
    }// end main
}//end class MS