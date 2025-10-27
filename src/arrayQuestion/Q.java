package arrayQuestion;

public class Q {
	public static void main(String[] args) {
		int arr [] = {10,20,30,40,50,60,70};
		reverseFirstThreeAndLastThree(arr);
	}
	
	public static void reverseFirstThreeAndLastThree(int [] arr) {
		int n= arr.length;
		int mid =n/2;
		int i=0;
		int j=mid-1;
		while(i<j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		i=mid+1;
		j=n-1;
		while(i<j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+ " ");
		}
	}

}
