/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        int length = s.length();
        char c;
        double output = 0;
        int isnagetive = 1;
        if (length == 0) {
            return 0;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            if (c == '-' && i == 0) {
                isnagetive = -1;
                continue;
            }
            if (c == '+' && i == 0) {
                continue;
            }
            if (c == '.' && i != 0) {
                break;
            }

            if (c >= 48 && c <= 57) {
                str.append(c);
                continue;
            } else {
                
                break;
            }

        }
        if (str.length() == 0) {
            return 0;
        }

        BigInteger out = new BigInteger(str.toString());
        output = out.doubleValue() * isnagetive;

        if (output > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (output < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return out.intValue() * isnagetive;
    }
}
// @lc code=end

