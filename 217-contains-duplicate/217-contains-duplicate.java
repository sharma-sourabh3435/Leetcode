import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int c : nums) {
            s.add(c);
        }
        return s.size() != nums.length;
    }
}