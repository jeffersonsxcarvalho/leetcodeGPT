package org.example.aarrayseraciocionio.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //brute force
    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //HashSet

    public static boolean containsDuplicateOptimized(int[] nums) {
        Set<Integer> valores = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(valores.contains(nums[i])){
                return true;
            }
            valores.add(nums[i]);
        }
        return false;
    }
}
