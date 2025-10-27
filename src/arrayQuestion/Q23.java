package arrayQuestion;

public class Q23 {
	public static void main(String[] args) {
		int [] arr = {7,4,3,0,5,1,6};
		int N=7;
		System.out.println("Missing Number is:"+missingElement(arr, N));
		
	}
	public static int missingElement(int[] arr, int N) {
		int actualSum=(N*(N+1))/2;
		int expectedSum =0 ;
		for(int i=0; i<arr.length; i++) {
			expectedSum+=arr[i];
		}
		return actualSum-expectedSum;
	}

}
