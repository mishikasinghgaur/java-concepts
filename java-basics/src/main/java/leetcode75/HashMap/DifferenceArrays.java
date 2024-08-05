//package leetcode75.HashMap;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class DifferenceArrays {
//    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> a1 = new ArrayList<>();
//        List<Integer> a2 = new ArrayList<>();
//
//        for(int n: nums2){
//            answer.add(uniqueElementList(a1,n,nums1));
//        }
//
//        for(int n:nums1){
//            answer.add(uniqueElementList(a2,n,nums2));
//
//        }
//
//        return answer;
//    }
//
//
//    public static void main(String[] args){
//
//        DifferenceArrays df = new DifferenceArrays();
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {2,4,6};
//
//        System.out.println(df.findDifference(arr1,arr2));
//    }
//}
