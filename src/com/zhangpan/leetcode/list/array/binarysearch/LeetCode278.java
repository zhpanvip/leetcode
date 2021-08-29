package com.zhangpan.leetcode.list.array.binarysearch;

/**
 * 278. 第一个错误的版本
 * <p>
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。
 * 由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * <p>
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * <p>
 * 你可以通过调用bool isBadVersion(version)接口来判断版本号 version 是否在单元测试中出错。
 * 实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-bad-version
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode278 {

    public int firstBadVersion(int n) {
        int left = 1, right = n, mid;
        while (left < right) {
            // 如果left与right都超过了int最大值的1/2,那么（left+right）会发生溢出，
            // 因此不能使用(left+right)/2求mid,而是应该用left+(right-left)/2
            mid = left + ((right - left) >> 1);
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int version) {
        return false;
    }
}
