package org.example.aarrayseraciocionio.maximumsubarray;

import java.util.Arrays;

public class MaximumSubArrayTest {
    static void main() {
        int[] nums0 = {-2, 1, -3, 4, -1, 2, 1, -5, 4, 3};
        int[] nums1 = {3, -2, 5, -8, 4, 6, -1, 2, -10, 3};
        int[] nums2 = {-5, 4, -1, 7, -3, 2, -8, 6, 1, -2};
        int[] nums3 = {-5, -2, -3, -1, -2};

        int[] resultado0 = MaximumSubArray.maximumSubArray(nums0);
        int[] resultado1 = MaximumSubArray.maximumSubArray(nums1);
        int[] resultado2 = MaximumSubArray.maximumSubArray(nums2);
        int[] resultado3 = MaximumSubArray.maximumSubArray(nums3);

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

        System.out.println(
                "Posição inicial: " + resultado3[0]
                        + " | Posição final: " + resultado3[1]
                        + " Maior Soma: " + resultado3[2]
        );

        System.out.println("##################################");

        int[] resultado4 = MaximumSubArray.maximumSubArray2(nums0);
        int[] resultado5 = MaximumSubArray.maximumSubArray2(nums1);
        int[] resultado6 = MaximumSubArray.maximumSubArray2(nums2);
        int[] resultado7 = MaximumSubArray.maximumSubArray2(nums3);


        System.out.println(
                "Posição inicial: " + resultado4[0]
                        + " | Posição final: " + resultado4[1]
                        + " Maior Soma: " + resultado4[2]
        );

        System.out.println(
                "Posição inicial: " + resultado5[0]
                        + " | Posição final: " + resultado5[1]
                        + " Maior Soma: " + resultado5[2]
        );

        System.out.println(
                "Posição inicial: " + resultado6[0]
                        + " | Posição final: " + resultado6[1]
                        + " Maior Soma: " + resultado6[2]
        );

        System.out.println(
                "Posição inicial: " + resultado7[0]
                        + " | Posição final: " + resultado7[1]
                        + " Maior Soma: " + resultado7[2]
        );

        System.out.println("##################################");

        int[] resultado8 = MaximumSubArray.maximumSubArray3(nums0);
        int[] resultado9 = MaximumSubArray.maximumSubArray3(nums1);
        int[] resultado10 = MaximumSubArray.maximumSubArray3(nums2);
        int[] resultado11 = MaximumSubArray.maximumSubArray3(nums3);

        System.out.println(
                "Posição inicial: " + resultado8[0]
                        + " | Posição final: " + resultado8[1]
                        + " Maior Soma: " + resultado8[2]
        );

        System.out.println(
                "Posição inicial: " + resultado9[0]
                        + " | Posição final: " + resultado9[1]
                        + " Maior Soma: " + resultado9[2]
        );

        System.out.println(
                "Posição inicial: " + resultado10[0]
                        + " | Posição final: " + resultado10[1]
                        + " Maior Soma: " + resultado10[2]
        );

        System.out.println(
                "Posição inicial: " + resultado11[0]
                        + " | Posição final: " + resultado11[1]
                        + " Maior Soma: " + resultado11[2]
        );

    }
}
