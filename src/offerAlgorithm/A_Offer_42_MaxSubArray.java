package offerAlgorithm;
/**
 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

 要求时间复杂度为O(n)。

  

 示例1:

 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 输出: 6
 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
  

 提示：

 1 <= arr.length <= 10^5
 -100 <= arr[i] <= 100
 */
public class A_Offer_42_MaxSubArray {
    /**
     dp 算法
     dp[i-1] <= 0  , dp[i] = nums[i]
     dp[i-1] >0 dp[i] = nums[i] + dp[i-1]
     */
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i<nums.length;i++){
            if(dp[i-1]<=0) dp[i] = nums[i];
            else dp[i] = nums[i]+dp[i-1];
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
