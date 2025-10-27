package arrayQuestion;

import java.util.Arrays;

public class Q1 {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,6};
	printBiggestAndSmallest(arr);
}

public static void printBiggestAndSmallest(int[] arr) {
	int max = Arrays.stream(arr).max().getAsInt();
	int min = Arrays.stream(arr).min().getAsInt();
	int diff = max-min;
	
	System.out.println("max: "+max);
	System.out.println("min:"+min);
	System.out.println("diff: "+diff);
}
}
