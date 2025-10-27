package arrayQuestion;

public class Q26 {
	public static void main(String[] args) {
		int [] arr = {2,3,7,8,9};
		System.out.println(strictlyIncreasing(arr));
		
	}
	public static boolean strictlyIncreasing(int [] arr) {
		boolean isStrictlyIncreasing = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] ==arr[i+1])
				isStrictlyIncreasing =false;
		}
		return isStrictlyIncreasing;
	}

}
