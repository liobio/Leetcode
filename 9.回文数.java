/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp;
        temp=x;
        int rev = 0;
        while (temp != 0) {
            int pop = temp % 10;//每次的余数
            temp /= 10;//去掉尾数

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return false;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return false;

            rev = rev * 10 + pop;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
        

 
    }

}

// @lc code=end

