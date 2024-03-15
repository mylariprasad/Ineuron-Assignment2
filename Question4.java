//WAP to sort an array using Merge Sort Algorithm.
public class Question4 {
    public static void main(String[] args) {
        int[] nums = {23, 45, 6, 2, 1, 30};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = nums[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = nums[mid + 1 + j];
        }
        
        // Merge the temp arrays
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
