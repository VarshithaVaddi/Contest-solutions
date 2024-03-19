
class Solution{
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> set = new HashSet<>();
        int prefixsum =0;
        for(int i=0;i<n;i++){
            prefixsum = prefixsum+arr[i];
            if(prefixsum==0 || set.contains(prefixsum)){
                return true;
            }
            set.add(prefixsum);
        }  
    return false;
        
    }
}