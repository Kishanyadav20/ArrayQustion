package arrayQuestion;

public class Q17 {
	public static void main(String[] args) {
		int a [] = {10,20,30,40,50,60,70};
		int k=3;
		int  value = 22;
		for(int x:a) {
			System.out.print(x+" ");
			
		}
		System.out.println("\n=====after insert======");
		a= insert(a, k, value);
		for(int x:a) {
			System.out.print(x+" ");
		}
		
	}
	
	public static int[] insert(int[] a, int k, int value) {
	
		int b[] = new int [a.length+1];
		 b[k]= value;
		for(int i=0; i<b.length;i++) {
			if(i<k) {
				b[i]=a[i];
				
			}else if(i>k){
				b[i]=a[i-1];
			}
		}
		return b;
		
			
		}
	}


