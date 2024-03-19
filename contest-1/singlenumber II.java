import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> Map = new HashMap<>();
        for (int num : nums) {
            Map.put(num, Map.getOrDefault(num, 0) + 1);
        }
        for (int num : Map.keySet()) {
            if (Map.get(num) % 3 != 0) {
                return num;
            }
        }
        return 0; 
    }
}