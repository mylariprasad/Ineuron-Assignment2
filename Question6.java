//WAP to check whether an array is a subset of another array.
public class Question6 {

	public static void main(String[] args) {
		int[] sub_arr = {2,3,4};
		int[] arr = {1,2,3,4,5,6};
		boolean result = false;
		for(int i=0;i<=arr.length-(sub_arr.length);i++) {
			int count = 0;
			for(int j=0; j< sub_arr.length;j++) {
				if(arr[i+j] == sub_arr[j]) {
					count++;
				}
				else{
					break;
				}
			}
			if (count == sub_arr.length) {
                result = true;
                break; 
            }
		}
		
		if(result) {
			System.out.println("Given array is subset of another array.");
		}
		else {
			System.out.println("Given array is not a subset of another array.");
		}
	}


}
