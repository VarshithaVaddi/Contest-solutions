class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] p = new long[n];
        long[] left = new long[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        long[] right = new long[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            p[i] = left[i]*right[i];
        }
    return p;
	} 
} 