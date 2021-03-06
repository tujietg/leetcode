package Algorithm.leetcode.Array;

public class No53 {

	public int maxSubArray(int[] nums) {
		int mid = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			mid = 0;
			for (int j = i; j < nums.length; j++) {
				mid += nums[i];
				if (mid > max) {
					max = mid;
				}
			}
		}
		return max;
	}

	public int maxSubArray01(int[] nums) {
		int max = Integer.MIN_VALUE;
		int mid = 0;
		for (int i = 0; i < nums.length; i++) {
			if (mid < 0) {
				mid = 0;
			}
			mid += nums[i];
			if (mid > max) {
				max = mid;
			}
		}
		return max;
	}

	public int maxSubArray02(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int sum = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (sum > 0) {
				sum += nums[i];
			} else {
				sum = nums[i];
			}
			if (max < sum) {

				max = sum;
			}
		}
		return max;
	}
}
