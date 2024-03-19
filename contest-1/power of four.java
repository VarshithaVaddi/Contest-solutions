class Solution {
    public boolean isPowerOfFour(int n) {
        double res =0;
        int x=0;
        if(n==1){
            return true;
        }
        while(res<=n){
            x++;
            res = Math.pow(4,x);
            if(res==n){
                return true;
            }
        }
    return res==n;
    }
}