package leetcode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0; // Edge case: empty array has 0 unique elements
        }

        int uniqueCount = 1; // Initialize unique element count to 1 (the first element is always unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                // If the current element is different from the previous one
                nums[uniqueCount] = nums[i]; // Move the unique element to its correct position
                uniqueCount++; // Increment the unique element count
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expectedNums = {1, 2, 3, 4, 5};
        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
