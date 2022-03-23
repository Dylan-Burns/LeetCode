//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]
//
//
//Constraints:
//
//1 <= nums.length <= 1000
//-10^6 <= nums[i] <= 10^6

import java.util.Arrays;

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < runningSum.length; i++){
            sum += nums[i];
            runningSum[i] =  sum;
        }
        return runningSum;
    }

    public static void main(String[] args) {
        RunningSum rs = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(rs.runningSum(nums)));
    }
}
