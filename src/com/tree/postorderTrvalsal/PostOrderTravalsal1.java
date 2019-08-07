/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PostOrderTravalsal1
 * Author:   think
 * Date:     2019/8/6 21:01
 * Description: 解法二
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tree.postorderTrvalsal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈
 *     要保证根结点在左孩子和右孩子访问之后才能访问，因此对于任一结点P，先将其入栈。
 *     如果P不存在左孩子和右孩子，则可以直接访问它；
 *     或者P存在孩子，但是其孩子都已被访问过了，则同样可以直接访问该结点
 *     若非上述两种情况，则将P的右孩子和左孩子依次入栈，这样就保证了
 *     每次取栈顶元素的时候，左孩子在右孩子前面被访问，左孩子和右孩子都在根结点前面被访问。〉<br>
 * 〈解法二〉
 *
 * @author think
 * @create 2019/8/6
 * @since 1.0.0
 */
public class PostOrderTravalsal1 {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre =null;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.peek();
            if (cur.left==null&&cur.right==null||(pre != null &&(pre == cur.left||pre==cur.right))){
                list.add(cur.val);
                pre = cur;
                stack.pop();
            }else{
                if (cur.right!=null){
                    stack.push(cur.right);
                }

                if (cur.left != null){
                    stack.push(cur.left);
                }
            }
        }
        return list;
    }
}
