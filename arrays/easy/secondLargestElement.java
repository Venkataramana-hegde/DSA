package arrays.easy;

class Solution {
    // public int secondLargestElement(int[] nums){
    //     int n = nums.length;
    //     if(n < 2){
    //         return -1;
    //     }
    //     Arrays.sort(nums);
    //     int largest = nums[n - 1];
    //     int secondLargest = -1;
    //     for(int i = n - 2; i >= 0; i--){
    //         if(nums[i] != largest){
    //             secondLargest = nums[i];
    //             break;
    //         }
    //     }
    //     return secondLargest;
    // }


    // public int secondLargestElement(int[] nums){
        // int n = nums.length;
        // if(n < 2){
        //     return -1;
        // }
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
    //     for(int i = 0; i < n; i++){
    //         largest = Math.max(largest, nums[i]);
    //     }
    //     for(int i = 0; i < n; i++){
    //         if(nums[i] != largest && nums[i] > secondLargest){
    //             secondLargest = nums[i];
    //         }
    //     }
    //     return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    // }
    public int secondLargestElement(int[] nums){
        int n = nums.length;
        if(n < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }



    public static void main (String[] args){
        int[] nums = {1, 2, 4, 6, 7, 5};

        // Create an instance of the Solution class
        Solution sol = new Solution();

        /* Call the method to find 
        the second largest element */
        int ans = sol.secondLargestElement(nums);

        System.out.println("The second largest element is: " + ans);
    }
}
