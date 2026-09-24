package org.example.aarrayseraciocionio.maximumsubarray;

import java.util.Arrays;

public class MaximumSubArrayTest {
    static void main() {
        int[] nums0 = {-2, 1, -3, 4, -1, 2, 1, -5, 4, 3};
        int[] nums1 = {3, -2, 5, -8, 4, 6, -1, 2, -10, 3};
        int[] nums2 = {-5, 4, -1, 7, -3, 2, -8, 6, 1, -2};

        int[] resultado0 = MaximumSubArray.maximumSubArray(nums0);
        int[] resultado1 = MaximumSubArray.maximumSubArray(nums1);
        int[] resultado2 = MaximumSubArray.maximumSubArray(nums2);

        System.out.println(
                "Posição inicial: " + resultado0[0]
                + " | Posição final: " + resultado0[1]
                + " Maior Soma: " + resultado0[2]
                );

        System.out.println(
                "Posição inicial: " + resultado1[0]
                        + " | Posição final: " + resultado1[1]
                        + " Maior Soma: " + resultado1[2]
        );

        System.out.println(
                "Posição inicial: " + resultado2[0]
                        + " | Posição final: " + resultado2[1]
                        + " Maior Soma: " + resultado2[2]
        );
    }
}
