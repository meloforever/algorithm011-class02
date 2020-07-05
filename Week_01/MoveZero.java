package learn_algorithm.algorithm011//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针


//leetcode submit region begin(Prohibit modification and deletion)


class MoveZero {
    /**
     * 对一个数组里面对位置进行移动，由于不能新建新的数组解决，就只能在原有对数组去做处理
     * 解题思路为：遍历数组，将非0的元素前移，每次前移后变更该位置
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 0) {
            System.out.println("Please input a nonempty array!");
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
