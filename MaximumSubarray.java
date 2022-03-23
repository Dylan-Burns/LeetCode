//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//A subarray is a contiguous part of an array.
//
//
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//
//
//Constraints:
//
//1 <= nums.length <= 105
//-104 <= nums[i] <= 104

// Use Kadane's Algorithm O(n) Complexity

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        //sets maxSoFar equal to MIN_VALUE of an Integer
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i : nums) {
            //adds first element to maxEndingHere
            maxEndingHere += i;
            //if the value of maxEndingHere is greater than maxSoFar
            //we assign the value of maxEndingHere to maxSoFar
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;

            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarray.maxSubArray(arr));
    }
}
