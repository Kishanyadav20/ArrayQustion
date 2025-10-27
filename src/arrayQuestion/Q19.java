package arrayQuestion;

public class Q19 {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7};
		int k=2;
		rotateKthElementRight(arr, k);
		System.out.println("Rotate Array");
		for(int num:arr) {
			System.out.println(num+ " ");
		}
	}
	public static void rotateKthElementRight(int [] arr, int k) {
		int n= arr.length;
		k=k%n;
		int temp[] =new int [n];
		
		for(int i=0; i<k; i++) { 
			temp[i]=arr[n-k+i];
			
		}
		for(int i=0; i<n-k;i++) {
			temp[k+i]=arr[i];
			
		}
		for(int i=0; i<n; i++) {
			arr[i]= temp[i];
		}
	}

}
