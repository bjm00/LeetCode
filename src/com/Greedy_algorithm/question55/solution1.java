/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: solution1
 * Author:   think
 * Date:     2020/4/18 10:34
 * Description: 贪心算法类型 跳跃游戏
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.Greedy_algorithm.question55;

/**
 * 〈一句话功能简述〉<br> 
 * 〈stack类型 跳跃游戏〉
 *
 * @author think
 * @create 2020/4/18
 * @since 1.0.0
 */
public class solution1 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max){
                max = Math.max(max,i + nums[i]);
                if (max >= nums.length -1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        solution1 test = new solution1();
        System.out.println(test.canJump(nums));
    }


}
