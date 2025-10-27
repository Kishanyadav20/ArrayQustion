package arrayQuestion;

public class Q4 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,};
		printResult(arr);
	}
	public static void printResult(int [] arr) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		int result [] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			result[i] = sum -arr[i];
			System.out.println(result[i]);
		}
		
		
		
//		System.out.println("Result is.....");
//		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i]+ " ");
//		}
//		System.out.println();
	}
	

}
