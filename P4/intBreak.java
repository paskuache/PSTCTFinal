class Break{
    public static int mult(int x, int a){
        int res = 1;
        while(a>0){
            if((a&1)>0)
                res = res * x;
            x = x * x;
            a >>= 1;
        }
    return res;
    }

    public static int breakInteger(int n) { 
        // base case 2 = 1 + 1 
        if (n == 2){ 
            return 1;
        } 
        // base case 3 = 2 + 1 
        if (n == 3) {
            return 2;
        } 
        int maxProduct=0; 

        // breaking based on mod with 3 
        switch (n % 3) { 
            // If divides evenly, then break into all 3 
            case 0: 
                maxProduct = mult(3, n/3); 
                break; 
            // If division gives mod as 1, then break as 
            // 4 + power of 3 for remaining part 
            case 1: 
                maxProduct = 2 * 2 * mult(3, (n/3) - 1);
                break; 
            // If division gives mod as 2, then break as 
            // 2 + power of 3 for remaining part 
            case 2: 
                maxProduct = 2 * mult(3, n/3); 
                break; 
        } 
        return maxProduct; 
    } 

    public static void main(String[] args){

        int maxProduct = breakInteger(5); 
        System.out.println(maxProduct); 
    } 
}