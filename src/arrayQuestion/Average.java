package arrayQuestion;

public class Average {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50};
	int avg;
	int sum =0;
	int count =0;
	for(int i=0; i<a.length; i++) {
		sum+=a[i]; count++;
		avg= sum/count;
		if(a[i]>avg) {
			System.out.println(a[i]);
		}
//		System.out.println(sum);
//		System.out.println(count);
	}	
	}
	
	
	
}
