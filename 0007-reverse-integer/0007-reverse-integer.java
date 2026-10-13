class Solution {
    public int reverse(int x) {
           int rev_num = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (rev_num > Integer.MAX_VALUE / 10 || rev_num < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev_num = rev_num * 10 + digit;
        }
        return rev_num;
    }
}     