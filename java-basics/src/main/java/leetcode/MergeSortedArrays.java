package leetcode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Index for the merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1.
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

   public static void directMerge (int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length > nums1.length) {
            System.arraycopy(nums1,0,nums2,n,m);
            Arrays.sort(nums2);
        } else {
            System.arraycopy(nums2,0,nums1,m,n);
            Arrays.sort(nums1);
        }
   }

   public static void main (String[] args) {
       int[] nums2 = {1, 2, 3, 0, 0, 0};
       int m = 3;
       int[] nums1 = {2, 5, 6};
       int n = 3;

       directMerge(nums1, m, nums2, n);

       if (nums1.length > nums2.length) {
           for (int num : nums1) {
               System.out.print(num + " ");
           }
       } else {
           for (int num : nums2) {
               System.out.print(num + " ");
           }
       }
   }
}
