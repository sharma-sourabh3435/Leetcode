class Solution {
    public static int reverse(int x) {
        int num = 0;
        while(x != 0) {
            int number = num*10 + x%10;

            if((number - x%10)/10 != num) {
                return 0;
            }
            else {
                num = number;
        }
            x = x / 10;
        }
        return num;
    }
}