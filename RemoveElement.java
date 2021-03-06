import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(re.removeElement(nums, val));
    }
}
