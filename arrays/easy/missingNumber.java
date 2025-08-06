package arrays.easy;

class Solution {
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     for(int i = 0; i <= n; i++){
    //         int flag = 0;
    //         for(int j = 0; j < n; j++){
    //             if(nums[j] == i){
    //                 flag = 1;
    //                 break;
    //             }
    //         }
    //         if(flag == 0) return i;
    //     }
    //     return -1;
    // }

    public int missingNumber(int[] nums){
        int n = nums.length;
        int[] freq = new int[n + 1];
        for(int num: nums){
            freq[num]++;
        }
        for(int i = 0; i <= n; i++){
            if(freq[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Example array with missing number
        int[] nums = {0,1, 2, 4};
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the missingNumber method to find the missing number
        int ans = solution.missingNumber(nums);
        
        // Output the missing number
        System.out.println("The missing number is: " + ans);
    }
}