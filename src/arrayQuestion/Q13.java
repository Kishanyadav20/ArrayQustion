package arrayQuestion;

public class Q13 {
public static void main(String[] args) {
	int [] arr1 = {10,20,30,40,30,20,10};
	int [] arr2 = {10,20,30,40,50,20,10};
	System.out.println(printPalindrome(arr1));
	System.out.println("===========");
	System.out.println(printPalindrome(arr2));
	
}

public static boolean printPalindrome(int[] arr) {
	int i=0; int j=arr.length-1;
	while(i<j) {
		if(arr[i]!=arr[j]) {
			return false;
		}
		i++; j--;
	}
	return true;
}

}
