package arrays.easy;

class Solution {
    public int maxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxi = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count ++;
                maxi = Math.max(maxi, count);
            }else{
                count = 0;
            }
        }
        return maxi;
    }

public static void main(String[] args) {
     
        int[] nums = {1, 1, 0, 1, 1, 1};

        // Create an instance of the Solution class
        Solution sol = new Solution();

        // Find and print the maximum consecutive 1s
        int ans = sol.maxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
}
}
