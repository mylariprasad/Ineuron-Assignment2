//WAP to sort an array using Bubble Sort Algorithm.
public class Question3 {

	public static void main(String[] args) {
		int[] arr = {9,3,55,22,85,10};
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
