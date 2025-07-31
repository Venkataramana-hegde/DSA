class Solution {

  public int[] selectionSort(int[] nums) {
    int n = nums.length;
    for(int i = 0; i < n; i++){
      int minIndex = i;
      for(int j = i + 1; j < n; j++){
        if(nums[j] < nums[minIndex]){
          minIndex = j;
        }
      }

      if(minIndex != i){
        int temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
      }
    }
    return nums;
  }
}

public class selection_sort {

  public static void main(String[] args) {
    int[] arr = {7, 5, 9, 2, 8};

    System.out.print("Original array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

    Solution solution = new Solution();

    int[] sortedArr = solution.selectionSort(arr);

    System.out.print("Sorted array: ");
    for (int num : sortedArr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}