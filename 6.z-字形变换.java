/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (s.length() <= numRows||numRows==1) {
            return s;
        }
        int rule = 2 * numRows - 2;
        int numColumns = (s.length() / rule + 1) * 2;
        int row = 0;
        int column = 0;

        char[][] out = new char[numColumns][numRows];
        for (int i = 0; i < s.length();) {
            if (row < numRows) {
                out[column][row++] = s.charAt(i++);
            }
            if (i == s.length()) {
                break;
            }

            if (row == numRows) {
                column++;
                for (row = numRows - 2; row != 0; row--) {
                    if (i == s.length()) {
                        break;
                    }
                    out[column][row] = s.charAt(i++);

                }
                column++;
            }

        }
        StringBuilder ss = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numColumns; c++) {
                // if(c==numColumns-1){
                // System.out.println(out[c][r]);
                // }

                if (out[c][r] == '\0') {
                    // System.out.print("");
                } else {
                    // System.out.print(out[c][r]);
                    ss.append(out[c][r]);

                }

            }
        }
        String s_out = new String(ss);
        return (String) s_out;

    }
}
// @lc code=end

