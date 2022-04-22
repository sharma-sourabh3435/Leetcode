class Solution {
    public int[] twoSum(int[] nums, int target) {
        // intialize a new hashmap
        HashMap<Integer, Integer> meow = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; 
            if(meow.containsKey(complement)) {
                return new int[] {i, meow.get(complement)};
            }
            else {
                meow.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}