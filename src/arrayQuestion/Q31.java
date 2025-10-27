package arrayQuestion;


public class Q31 {
	public static void main(String[] args) {
		int arr1[] = {1,3,3,4,5,6};
	int arr2[]= {1,2,3,4,5,6};
		System.out.println(sameArray(arr1,arr2 ));
	}
	
	public static boolean sameArray(int arr1 [], int arr2[] ) {

		if(arr1.length!=arr2.length)
			return false;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	}