
/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */
// 
// @lc code=start
// 在确定其中一个数后，可以将问题变成求两数之和
// 在对数组排序之后，可以通过判定重复元素，消除重复项
// 通过下标的大小比较可以确定两数在数组中的位置
// 两数求和后与确定的元素比较大小，从而确定是哪个元素去改变重新组合

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        int length = nums.length;
        if (length < 3) {
            return out;
        }
        Arrays.sort(nums);

        int first, left, right;
        for (first = 0; first < length - 2; first++) {
            if (nums[first] > 0) {
                break;
            }
            left = first + 1;
            right = length - 1;
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            while (left < right) {
                if (nums[right] + nums[left] == -nums[first]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[first]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    out.add(temp);
                    left++;
                    right--;
                    while (right > left && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (right > left && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    continue;
                }
                if (nums[right] + nums[left] > -nums[first]) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return out;

    }
}

// @lc code=end
