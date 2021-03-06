package Algorithm.leetcode.Array;

import java.util.HashMap;

public class No01 {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int a = target - nums[i];
			if (map.containsKey(a) && map.get(a) != i) {
				return new int[] { i, map.get(a) };
			}
		}
		return null;
	}
}
