/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int string_index=0;
        String temp=s.substring(string_index,string_index+1);
        char c;
        int max=1;
        int temp_length=temp.length();
        for(int i=1;i<s.length();i++){
            
            c=s.charAt(i);
         
            for(int j=0;j<temp_length;j++){
                if(temp.charAt(j)==c){//重复
                 
                   
                    //temp begin to next s'index
                    string_index++;
                    i=string_index;
                    temp=s.substring(string_index,string_index+1);
                    
                    break;
                } 
                if(j==temp.length()-1){
                    
                    temp=s.substring(string_index,string_index+temp.length()+1);
                    
                 
                }       
            }
            if(temp.length()>max)
                max=temp.length();
            temp_length=temp.length();
        }
        return max;

    }
}
// @lc code=end

