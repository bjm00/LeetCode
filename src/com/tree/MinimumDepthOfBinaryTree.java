/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MinimumDepthOfBinaryTree
 * Author:   think
 * Date:     2019/8/5 18:39
 * Description: 求二叉树的最小深度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tree;

import java.util.*;
/**
 * 〈使用BFS广度优先遍历
 *  非递归解法〉<br>
 * 〈求二叉树的最小深度〉
 *
 * @author think
 * @create 2019/8/5
 * @since 1.0.0
 */
public class MinimumDepthOfBinaryTree {
    public int run(TreeNode root) {
        if (root == null){
            return 0;
        }

        if (root.left==null&&root.right==null){
            return 1;
        }
        LinkedList queue = new LinkedList();
        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = (TreeNode) queue.poll();
                if (node.right == null&&node.left == null){
                    return level;
                }

                if (node.left != null){
                    queue.add(node.left);
                }

                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            level++;
        }
        return level;
    }
}


   class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
