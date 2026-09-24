package org.example.aarrayseraciocionio.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // força bruta
    public static int[] twoSumA(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumB(int[] nums, int target) {
        Map<Integer,Integer> chavesValor = new HashMap<>();

        chavesValor.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            if(chavesValor.containsKey(target-nums[i])){
                return new int[]{chavesValor.get(target-nums[i]), i};
            }
            chavesValor.putIfAbsent(nums[i], i);
        }

        return null;
    }
}
