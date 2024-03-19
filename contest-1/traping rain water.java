class Solution {
    public static int maxprefixsum(int index,int height[]){
        int max=0;
        for(int i=0;i<=index;i++){
            if(height[i]>max){
               max= height[i];
            }
        }
    return max;
    }
    public static int maxsufixsum(int index,int height[]){
        int max=0;
        for(int i=index;i<=height.length-1;i++){
            if(height[i]>max){
               max= height[i];
            }
        }
    return max;
    }
    public int trap(int[] height) {
        int sum=0;
        for(int i=1;i<height.length-1;i++){
             int sum1 = maxprefixsum(i,height);
             int sum2 = maxsufixsum(i,height);
             int min = Math.min(sum1,sum2);
             int res = min-height[i];
             sum = sum+res;
        }
    return sum;
    } 
}
