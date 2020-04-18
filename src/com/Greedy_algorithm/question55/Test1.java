/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test1
 * Author:   think
 * Date:     2020/4/18 23:33
 * Description: 温习55题的解法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.Greedy_algorithm.question55;

/**
 * 〈一句话功能简述〉<br> 
 * 〈温习55题的解法〉
 *
 * @author think
 * @create 2020/4/18
 * @since 1.0.0
 */
public class Test1 {
    public boolean isAccess(int[] nums){
        int most = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= most){
                most = Math.max(most,i + nums[i]);
                if (most >= nums.length - 1){
                    return true;
                }
            }
        }
        return false;
    }

}
