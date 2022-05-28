import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int c : nums) {
            if(s.contains(c)) return true;
            s.add(c);
        }
        return false;
    }
}