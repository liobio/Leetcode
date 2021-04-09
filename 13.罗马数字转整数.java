/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int out=0;
        int rev=0;
        char temp;
        int pre_value=1000;
        for(int i=0;i<s.length();i++){

            temp=s.charAt(i);

            if(temp=='I'){
                rev=1;
                
            }
            if(temp=='V'){
                rev=5;
                
            }
            if(temp=='X'){
                rev=10;
                
            }
            if(temp=='L'){
                rev=50;
                
            }
            if(temp=='C'){
                rev=100;
                
            }
            if(temp=='D'){
                rev=500;
                
            }
            if(temp=='M'){
                rev=1000;
                
            }

            if(pre_value<rev){
                out-=2*pre_value;
                out+=rev;
            }
               
            if(pre_value>=rev){
                out+=rev;
            }
            pre_value=rev;
        }

        return out;

    }
}
// @lc code=end

