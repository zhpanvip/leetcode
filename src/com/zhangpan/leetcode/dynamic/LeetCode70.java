package com.zhangpan.leetcode.dynamic;

import java.util.HashMap;

/**
 * 假设你正在爬楼梯。需要 n阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode70 {

    HashMap<Integer, Integer> map = new HashMap<>();

    /**
     * 递归法
     * 时间复杂度为 O(2^n)，每递归一层复杂度是上一层的2倍
     * https://pic.leetcode-cn.com/1624713559-UBxbwC-image.png
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    /**
     * 递归优化
     * 暴力的使用递归法时间复杂度过高，可以看到下图中存在很多重复的计算：
     * https://pic.leetcode-cn.com/1624713559-UBxbwC-image.png
     * 因此，可以使用缓存，将计算过的数据存入缓存中避免多次重复计算。
     */
    public int climbStairs1(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int sum = climbStairs1(n - 1) + climbStairs1(n - 2);
        map.put(n, sum);
        return sum;
    }

    /**
     * 动态规划
     */
    public int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
