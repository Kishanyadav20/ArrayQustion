package arrayQuestion;

public class Q5 {
	public static void main(String[] args) {
		int [] arr = {2,5,4,3,6};
		printAllElement(arr);
	}
	
	public static void printAllElement(int [] arr) {
		int result[] =new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int prod =1;
			
			for(int j=0; j<arr.length; j++) {
				if(i!=j)
					prod *=arr[j];
			}
			result[i] = prod;
			//System.out.print(result[i]+" ");
		}
		
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}
