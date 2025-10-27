package arrayQuestion;

public class Q6 {
	public static void main(String[] args) {
		int [] arr = {2,3,5,6,4};
		concateOfArray(arr);
		
	}
	
	public static void concateOfArray(int [] arr) {
		int res [] =new int[2*arr.length];
		
		for(int i=0; i<2*arr.length; i++) {
			res[i]=arr[i%arr.length];
			
		}
		
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
