class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        double res =0;
        if(n==1){
            return true;
        }
        while(res<=n){
            x++;
            res = Math.pow(3,x);
            if(res==n){
                return true;
            }
        }
    return false;
    }
}