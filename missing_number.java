class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i<=nums.length-1;i++){
            sum += nums[i];
        }
        int n = nums.length;
        int naturalsum = (n*(n+1))/2;
        int res=naturalsum-sum;
        return res;
    }
}
