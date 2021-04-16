/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c) {
            case ')':
                if(!stack.isEmpty() && stack.pop() == '('){
                    break;
                }else{
                    return false;
                }
            case ']':
                if(!stack.isEmpty() && stack.pop() == '['){
                    break;
                }else{
                    return false;
                }
            case '}':
                if(!stack.isEmpty() && stack.pop() == '{'){
                    break;
                }else{
                    return false;
                }
            default:
                stack.push(c);
                break;
            }
        }
        return stack.isEmpty();
    

    }
}
// @lc code=end

