/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // 采用双指针放方法
        int Head = 0;
        int Tail = height.length - 1;
        int Area = 0;
        int maxArea = 0;
        while (Head != Tail) {
            Area = (Tail - Head) * (height[Tail] > height[Head] ? height[Head] : height[Tail]);
            maxArea = Area > maxArea ? Area : maxArea;
            if (height[Head] > height[Tail]) {
                Tail--;
            } else {
                Head++;
            }
        }
        return maxArea;

    }
}
// @lc code=end

