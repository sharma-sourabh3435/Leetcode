/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

link: https://leetcode.com/problems/two-sum/ 
 */
// Brute force solution to this problem
/*
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // new array of size 2
        int[] arr = new int[2];
        // use a loop to go through a elements of the given array
        for(int i=0; i<nums.length-1; i++) {
            // use a second array to go through elements after the element selected in previous loop 
            for(int j= i + 1; j<nums.length; j++) {
                // use conditional statement to see if sum of the two elements equal the target
                    if (nums[i] + nums[j] == target) {
                        // if the condition is satisfied then initialize arr
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
            }
        }
        return arr;
    }
}

*/
// Solution using hashtable

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Use hashmap for O(n) solution
        Map<Integer, Integer> map = new HashMap<>();
        // for loop to go through all elements of array
        for (int i=0; i<nums.length; i++) {
            // create a variable integer to store ith element of array
            int x = nums[i];
            // if map contains target-x then return the position of element in array and position of target-x as array
            if(map.containsKey(target-x)) {
                return new int[] { map.get(target-x), i};
            }
            map.put(x,i);
        }
        // otherwise throw exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
