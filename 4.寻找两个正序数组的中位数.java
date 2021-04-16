import java.util.*;

/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int lenth=nums1.length+nums2.length;
        int[] combine=new int[lenth];
        int i;
        for( i=0;i<nums1.length;i++){
            combine[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            combine[i]=nums2[j];
            i++;
        }
        for(i = 0; i < lenth; i++) {
            for(int j = 0; j < lenth - 1 - i; j++) {
                if(combine[j] > combine[j+1]) {       // 相邻元素两两对比
                    int temp = combine[j+1];       // 元素交换
                    combine[j+1] = combine[j];
                    combine[j] = temp;
                }
            }
        }
        for(int j=0;j<combine.length;j++){
            System.out.println(combine[j]);
        }
        if(lenth%2==1){
            
            return combine[lenth/2];
        }
        else{
            double result =(combine[lenth/2]+combine[(lenth/2)-1]);
            return result/2;
        }
    }
}
// @lc code=end

