/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MinimumDepthOfBinaryTree1
 * Author:   think
 * Date:     2019/8/5 19:32
 * Description: 使用BFS广度优先遍历，递归解法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tree.MinimumDepthOfBinaryTree;

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用BFS广度优先遍历，递归解法〉
 *
 * @author think
 * @create 2019/8/5
 * @since 1.0.0
 */
public class MinimumDepthOfBinaryTree1 {
    public int run(TreeNode root) {
        if (root == null){
            return 0;
        }

        if (root.left==null&&root.right==null){
            return 1;
        }

        if (root.left == null ||root.right == null){
            return Math.max(run(root.left),run(root.right)) + 1;
        }
        return Math.min(run(root.left),run(root.right)) + 1;
    }
}
