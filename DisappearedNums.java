//448. Find All Numbers Disappeared in an Array

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 105
//1 <= nums[i] <= n
//
//
//Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

import java.util.*;

public class DisappearedNums {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] a = new int[nums.length + 1];
        List<Integer> list = new ArrayList<>();

        for (int num : nums){
            System.out.println("num: " + num);
            a[num]++;
        }
        System.out.println("a: " + Arrays.toString(a));

        for(int i = 1; i < nums.length + 1; i++) {
            if (a[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        DisappearedNums dn = new DisappearedNums();
//        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums = {1, 1};
        System.out.println(dn.findDisappearedNumbers(nums));
    }

}
