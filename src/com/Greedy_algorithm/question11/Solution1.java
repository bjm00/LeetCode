/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution1
 * Author:   think
 * Date:     2020/4/18 20:44
 * Description: 贪心算法解决第11题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.Greedy_algorithm.question11;

/**
 * 〈一句话功能简述〉<br> 
 * 〈贪心算法解决第11题〉
 *
 * @author think
 * @create 2020/4/18
 * @since 1.0.0
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 test = new Solution1();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(test.maxArea(nums));
    }
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0;
        int left = 0;
        int right = n -1;
        while (left < right){
            area = Math.max(area,(right - left) * Math.min(height[left],height[right]));
            if (height[left] < height[right]){
                left++;
            }else if (height[left] == height[right]){
                left++;
                right--;
            }else {
                right--;
            }
        }
        return area;
    }

}
