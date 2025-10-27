package arrayQuestion;

public class Q14 {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6};
		int[] result = (runningSum(arr));
		for(int n:result) {
			System.out.print(n+" ");
		}
	}
	public static int[] runningSum(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			arr[i]+=arr[i-1];
		}
		return arr;
	}
	

}
