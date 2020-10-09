package com.mfq.leetcode.code998;

import com.mfq.dfs.TreeNode;

/**
 * @Description: 最大二叉树2
 * 最大树定义：一个树，其中每个节点的值都大于其子树中的任何其他值。
 *
 * 给出最大树的根节点 root。
 *
 * 就像之前的问题那样，给定的树是从表 A（root = Construct(A)）递归地使用下述 Construct(A) 例程构造的：
 *
 * 如果 A 为空，返回 null
 * 否则，令 A[i] 作为 A 的最大元素。创建一个值为 A[i] 的根节点 root
 * root 的左子树将被构建为 Construct([A[0], A[1], ..., A[i-1]])
 * root 的右子树将被构建为 Construct([A[i+1], A[i+2], ..., A[A.length - 1]])
 * 返回 root
 * 请注意，我们没有直接给定 A，只有一个根节点 root = Construct(A).
 *
 * 假设 B 是 A 的副本，并附加值 val。保证 B 中的值是不同的。
 *
 * 返回 Construct(B)。
 *
 * @Author: mufanqiang
 * @Date: 2020/10/09 17:41
 */
public class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        return null;
    }
}
