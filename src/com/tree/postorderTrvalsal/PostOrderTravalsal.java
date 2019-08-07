/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PostOrderTravalsal
 * Author:   think
 * Date:     2019/8/5 19:59
 * Description: 后序遍历二叉树节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tree.postorderTrvalsal;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈后序遍历二叉树节点〉
 *  Given a binary tree, return the postorder traversal of its nodes' values.
 * @author think
 * @create 2019/8/5
 * @since 1.0.0
 */
public class PostOrderTravalsal {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if (root==null){
            return list;
        }

        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(0,node.val);
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right!= null){
                stack.push(node.right);
            }
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
