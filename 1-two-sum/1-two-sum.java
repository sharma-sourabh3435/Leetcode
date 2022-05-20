import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            
            int c = target - nums[i];
            if(m.containsKey(c)){
                return new int[] {i, m.get(c)};
            }
            else {
                m.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
