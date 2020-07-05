package learn_algorithm.algorithm011

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 8578 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return new int[0];
        }
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            numsMap.put(nums[i], i);
        }

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int secondValue = target - nums[i];
            Integer secondValueIndex = numsMap.get(secondValue);
            if (secondValueIndex == null || secondValueIndex == i) {
                continue;
            } else {
                result[0] = i;
                result[1] = secondValueIndex;
                return result;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
