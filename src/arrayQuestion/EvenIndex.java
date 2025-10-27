package arrayQuestion;

public class EvenIndex {
public static void main(String[] args) {
	int [] a= {10,20,30,40};
	System.out.println(a);
	for(int i=0; i<a.length;i++) {
		if(i%2==0)
		System.out.println(i);
	}
}

}
