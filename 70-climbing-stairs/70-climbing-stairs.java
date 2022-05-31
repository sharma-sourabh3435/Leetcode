class Solution {
    public int climbStairs(int n) {
        int[] na = new int[46];
        
        na[1] = 1;
        na[2] = 2;
        
        for(int i = 3; i <=45; i++) {
            na[i] = na[i-1] + na[i-2];
        }
        return na[n];
    }
}