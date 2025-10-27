package arrayQuestion;

public class Q27 {
	public static void main(String[] args) {
		int arr [] = {2,7,7,8,9};
		System.out.println("Is sorted Array: "+isSortedArray(arr));
		
	}
	
	public static boolean isSortedArray(int[] arr) {
		boolean isSortedOrder =false;
		for(int i=0; i<arr.length-1; i++) {
		if(arr[i]<=arr[i+1])
			isSortedOrder = true;
		}
		return isSortedOrder;
	}

}
