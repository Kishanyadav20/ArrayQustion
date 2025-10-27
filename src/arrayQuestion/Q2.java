package arrayQuestion;

public class Q2 {
	public static void main(String[] args) {
		String [] str = {"kishan", "abhi", "ram", "Ankit"};
		evenNumberOfCharacter(str);
	}
	public static void evenNumberOfCharacter(String [] str) {
		int count =0;
		for(String s: str) {
			if(s.length()%2==0) {
				System.out.println(s);
				count++;
			}
		}
		System.out.println("total count: "+ count);
	}

}
