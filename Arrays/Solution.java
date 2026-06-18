import java.util.HashMap;
import java.util.Arrays;

public class Solution {
    // 1. The method must be inside the class
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    // 2. The main execution block must wrap the solver instantiation
    public static void main(String[] args) {
        Solution solver = new Solution(); // This creates the object instance
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solver.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
