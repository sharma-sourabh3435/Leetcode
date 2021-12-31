
//Brute force Solution:
//Time Complexity: O(n^2)
//Space complexity: O
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i<nums.length; i++) {
            for (int j = i + 1; j<nums.length; j++) {
                int complement = target - nums[i];
                
                if (nums[j] == complement) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0,0};
    }
}
