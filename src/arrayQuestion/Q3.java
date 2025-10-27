package arrayQuestion;

public class Q3 {
	public static void main(String[] args) {
		String [] str = {"kishan", "Ramayan", "Abhishek", "Ankit"};
		largestString(str);
	}
  public static void largestString(String[] str) {
	  String largest = str[0];
	  for(String s: str) {
		  if(s.length()>largest.length()) {
			  largest = s;
			  
		  }
		  
	  }
	  System.out.println("Largest String is: "+largest);
  }
}
