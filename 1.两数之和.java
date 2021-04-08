/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] out = new int[2];//动态数组的标准分配	
    int i,j;	
        for( i=0; i< nums.length;i++) 
        {
            for(j=i+1;j< nums.length ;j++) {
                if(nums[i]+nums[j] == target) {
                    out[0]=i;
                    out[1]=j;
                    break;
                }
            }
        }
        return  out;
    }
}
// @lc code=end

