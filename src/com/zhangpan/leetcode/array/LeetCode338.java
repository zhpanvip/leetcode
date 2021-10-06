package com.zhangpan.leetcode.array;

/**
 * 给你一个整数 n ，对于0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 *
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：[0,1,1]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：[0,1,1,2,1,2]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 *
 * 提示：
 *
 * 0 <= n <= 10^5
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/counting-bits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode338 {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i =0; i<= n; i++){
            ans[i] = bitsCount(i);
        }
        return ans;
    }

    /**
     * text{Brian Kernighan}Brian Kernighan 算法的原理是：对于任意整数 x，令 x=x&(x−1)，
     * 该运算将 x 的二进制表示的最后一个 1 变成 0。因此，对 x 重复该操作，直到 x 变成 0，则操作次数即为 x 的「一比特数」。
     *
     */
    public int bitsCount(int i){
        int count = 0;
        while( i > 0){
            i = i & (i-1);
            count++;
        }
        return count;
    }
}
