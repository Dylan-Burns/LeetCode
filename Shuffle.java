import java.util.Arrays;

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2 * n];
        for(int i = 0, j = 0; i < n; i++){
            newArr[j++] = nums[i];
            newArr[j++] = nums[i + n];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Shuffle s = new Shuffle();
        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(s.shuffle(nums, 3)));
    }
}
