import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class test_main {
    public static void main(String[] args) {
        int[] testcase = { -1,2,1,-4 };
        Solution test = new Solution();
        System.out.println(test.threeSumClosest(testcase,1));

    }

    public static class Solution {
        public String intToRoman(int num) {
            String out = " ";
            int x4 = num / 1000;
            int x3 = num % 1000 / 100;
            int x2 = num % 100 / 10;
            int x1 = num % 10;
            System.out.println(x4 + "," + x3 + "," + x2 + "," + x1);
            switch (x4) {
                case 1:
                    out = out.concat("M");
                    break;
                case 2:
                    out = out.concat("MM");
                    break;
                case 3:
                    out = out.concat("MMM");
                    break;

                default:
                    break;
            }
            switch (x3) {

                case 1:
                    out = out.concat("C");
                    break;
                case 2:
                    out = out.concat("CC");
                    break;
                case 3:
                    out = out.concat("CCC");
                    break;
                case 4:
                    out = out.concat("CD");
                    break;
                case 5:
                    out = out.concat("D");
                    break;
                case 6:
                    out = out.concat("DC");
                    break;
                case 7:
                    out = out.concat("DCC");
                    break;
                case 8:
                    out = out.concat("DCCC");
                    break;
                case 9:
                    out = out.concat("CM");
                    break;
                default:
                    break;

            }
            switch (x2) {

                case 1:
                    out = out.concat("X");
                    break;
                case 2:
                    out = out.concat("XX");
                    break;
                case 3:
                    out = out.concat("XXX");
                    break;
                case 4:
                    out = out.concat("XL");
                    break;
                case 5:
                    out = out.concat("L");
                    break;
                case 6:
                    out = out.concat("LX");
                    break;
                case 7:
                    out = out.concat("LXX");
                    break;
                case 8:
                    out = out.concat("LXXX");
                    break;
                case 9:
                    out = out.concat("XC");
                    break;
                default:
                    break;
            }
            switch (x1) {

                case 1:
                    out = out.concat("I");
                    break;
                case 2:
                    out = out.concat("II");
                    break;
                case 3:
                    out = out.concat("III");
                    break;
                case 4:
                    out = out.concat("IV");
                    break;
                case 5:
                    out = out.concat("V");
                    break;
                case 6:
                    out = out.concat("VI");
                    break;
                case 7:
                    out = out.concat("VII");
                    break;
                case 8:
                    out = out.concat("VIII");
                    break;
                case 9:
                    out = out.concat("IX");
                    break;
                default:
                    break;
            }

            return out;
        }

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
    
        public int threeSumClosest(int[] nums, int target) {
        
            int length = nums.length;
            int sum,abs,out;
            int min=Integer.MAX_VALUE;
            Arrays.sort(nums);
            int first, left, right;
            
            
            return out;
        }

    }
}
