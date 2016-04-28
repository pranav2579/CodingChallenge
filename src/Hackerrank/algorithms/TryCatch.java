package Hackerrank.algorithms;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch t = new TryCatch();
		int s = t.print();
		System.out.println(s);

	}
	@SuppressWarnings("finally")
	public int print(){
		try{
			
			System.out.println("inside try block");
			System.out.println("Returning from try");
			return 1;
		}
		finally{
			System.out.println("indide finally");
			System.out.println("Returning from finally");
			return 3;
		}
		
	}

}
