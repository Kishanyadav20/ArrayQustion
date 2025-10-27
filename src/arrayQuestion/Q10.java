package arrayQuestion;

public class Q10 {
public static void main(String[] args) {
	int [] arr = {10,20,30,40,50,60};
	printSwapArray(arr);
}

public static void printSwapArray(int [] arr) {
	int i=1;
	int j=5;
	//Swapping code
	
	int temp= arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
	for(int k=0; k<arr.length; k++) {
		System.out.print(arr[k]+" ");
	}
}
}
