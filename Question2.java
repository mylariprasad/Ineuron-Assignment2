//WAP to sort an array using Quick Sort Algorithm.
public class Question2 {
    public static void main(String[] args) {
        int[] nums = {23, 45, 6, 2, 1, 30};
        int high = nums.length - 1;
        int low = 0;
        quickSort(nums, low, high);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1); // Sort left partition
            quickSort(nums, partitionIndex + 1, high); // Sort right partition
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }
}
