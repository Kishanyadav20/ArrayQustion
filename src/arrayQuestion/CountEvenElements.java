package arrayQuestion;

public class CountEvenElements {
public static void main(String[] args) {
	int [] a= {10,20,30,40};
	int count =0;
	for(int i=0; i<a.length; i++) {
		
		if(a[i]%2==0) {
			count++;
		}
		
	}
	System.out.println(count);
}
}
