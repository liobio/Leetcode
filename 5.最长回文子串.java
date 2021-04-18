/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        if(s.length()==1){
            return s;
        }
        String out="";
        for(int i=0;i<s.length()-max;i++){
            for(int j=i;j<s.length();j++){

           
                if(StringisPalindrome(s.substring(i,j+1))){
                    if(s.substring(i,j+1).length()>max){
                        max=s.substring(i,j+1).length();
                        out=s.substring(i,j+1);
                    }
                }
            }
        }

        return out;
    }

    public boolean StringisPalindrome(String s){
        int length =s.length();
        int j=length-1;
        for(int i=0;i<length/2;i++){
            if(s.charAt(i)!=s.charAt(j-i)){
                return false;
            }
        }
        return true;
        
    }
}
// @lc code=end

