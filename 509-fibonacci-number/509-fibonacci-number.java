class Solution {
    public int fib(int n) {
        int[] arr = new int[31];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        if(n > 2) {
            arr[n] = fib(n-1) + fib(n-2);
            
        }
        return arr[n];
    }
}