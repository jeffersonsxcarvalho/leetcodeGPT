package org.example.aarrayseraciocionio.containsduplicate;

public class ContainsDuplicateTest {
    static void main() {
        int[] nums = new int[]{2, 8, 98, 100, 5, 2};
        int[] nums2 = new int[]{2, 8, 98, 100, 5};

        System.out.println(ContainsDuplicate.containsDuplicateBruteForce(nums));
        System.out.println(ContainsDuplicate.containsDuplicateBruteForce(nums2));

        System.out.println(ContainsDuplicate.containsDuplicateOptimized(nums));
        System.out.println(ContainsDuplicate.containsDuplicateOptimized(nums2));


    }
}
