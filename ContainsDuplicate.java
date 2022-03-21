//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//
//
//Constraints:
//
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    //BRUTEFORCE METHOD-- O(n^2) Complexity
//    public boolean containsDuplicate(int[] nums) {
//        if(nums == null || nums.length == 0) return false;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
////                    System.out.println("Nums[" + i + "] = "  + nums[i]
////                            + "\nNums[" + j + "] = " + nums[j]);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


    //Sorting method -- O(nlogn) Complexity
//    public boolean containsDuplicate(int[] nums){
//            if (nums == null || nums.length == 0) return false;
//
//            Arrays.sort(nums);
//            int l = nums.length;
//            for (int i=1; i<l; i++) {
//                if (nums[i-1] == nums[i]) {
//                    return true;
//                }
//            }
//            return false;
//    }

    //MOST EFFICIENT METHOD -- O(1) Complexity
    public boolean containsDuplicate(int[] nums){
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = new int[]{1, 2, 3, 4, 4};
        System.out.println(cd.containsDuplicate(nums));;
    }
}
