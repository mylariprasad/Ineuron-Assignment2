//WAP to find the duplicates present in an array.
public class Question1 {

	public static void main(String[] args) {
		int[] nums = { 1,3,5,3,78,2,5,78,1,9};
		System.out.println("The duplicate values present in array are:");
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.print(nums[i]+" ");
                }
            }
        }
	}

}
