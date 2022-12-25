package LeetCode.Arrays;

public class moveZeroes283 {

    public void moveZeroes(int nums[]) {

        if(nums == null || nums.length == 0) return;

        int insert = 0;

        for(int num : nums) {
            if(num != 0) {
                nums[insert++] = num;
            }
        }
        while(insert < nums.length) {
            nums[insert++] = 0;
        }
    }
}
