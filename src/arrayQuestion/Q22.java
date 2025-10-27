package arrayQuestion;

public class Q22 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int k=2;
		rotateKthElementLeft(arr, k);
		System.out.println("Rotate Array");
		for(int nums:arr) {
			System.out.print(nums+" ");
		}
	}
	
	public static void rotateKthElementLeft(int[] arr, int k) {
		int n= arr.length;
		k=k%n;
		int temp[]=new int [n];
		
		for(int i=0; i<n-k;i++) {
			temp[i]=arr[k+i];
			
		}
		for(int i=0; i<k;i++) {
			temp[n-k+i]=arr[i];
		}
		for(int i=0;i<n; i++) {
			arr[i]=temp[i];
		}
	}

}
