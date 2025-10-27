package arrayQuestion;

public class ThreeDigit {
public static void main(String[] args) {
	int [] a= {463,122,432,2412,332,11};
	int count =0;
	for(int i=0; i<a.length; i++) {
		if(100<=a[i] && a[i]<1000) {
			count++;
			System.out.println(a[i]);
		}
	}
	System.out.println("Toatal number of three digit: "+count);
}
}
