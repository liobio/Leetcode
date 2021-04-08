/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
    
        int out=0;
        if(x==0){
            return out=0;
        }
        int a=0;//有几位数
        int b;//余数
        int[] c=new int[10];
        int d=10;//权重初始值
        while(true){
            
            b=x%d;//取余数
            x=x/d;//去掉最后一位数字
            c[a]=b;
            if(x==0){
                break;
            }
            a++;

        } 
        int e=a;
        for(int i=0;i<=a;i++){
            out+=c[i]*Math.pow(10, e);
            e--;
        }  
        if(out>=)
        return out;
    
    }
}
// @lc code=end

