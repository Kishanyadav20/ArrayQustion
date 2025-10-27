package arrayQuestion;

public class Q9 {
	public static void main(String[] args) {
		int [] arr = {6,1,1,1,7,7,1,7,1,1};
		printMaxConsecutive(arr);
		
	}
	
	public static void printMaxConsecutive(int[] arr) {
		int n=7;
		int count =0;
		int max =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				count++;
				if(count >max) {
					max=count;
				}
			}else {
				count =0;
			}
		}
		System.out.println(max);
	}

}
