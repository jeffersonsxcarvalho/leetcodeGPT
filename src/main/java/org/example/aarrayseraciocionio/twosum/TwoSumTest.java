package org.example.aarrayseraciocionio.twosum;

import java.util.Arrays;

public class TwoSumTest {
    static void main() {
        int[] nums = new int[]{2, 7, 11, 15};

        int target = 22;

        System.out.println(Arrays.toString(TwoSum.twoSumA(nums, target)));
        System.out.println(Arrays.toString(TwoSum.twoSumB(nums, target)));
    }
}
