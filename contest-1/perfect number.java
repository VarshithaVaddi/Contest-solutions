class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num%2!=0){
            return false;
        }
        if(num%2==0){
            for(int i=1;i<num;i++){
                if(num%i==0){
                   sum = sum+i;
                }
            }
        }
    return sum==num;
    }
}