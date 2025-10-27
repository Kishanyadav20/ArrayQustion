package arrayQuestion;

public class Q29 {
	public static void main(String[] args) {
		int arr [] = {0,1,1,0,0,1,0,0};
		for(int nums:arr) {
			System.out.print(nums+" ");
			
			shiftZerosLeft(arr);
			for(int num:arr) {
				System.out.print(num+" ");
			}
		}
	}
	
	public static void shiftZerosLeft(int[] arr) {
		int left =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
			int temp =arr[left];
			arr[left]=arr[i];
			arr[i]=temp;
			left++;
			
		}
	}

}
}
