package algorithms;

public class Tests {
	
	String name;
	void display(Tests t){
		t.name = "Akash";
		t = null;
	}
	public static void main(String[] args)
	{
		Tests t = new Tests();
		t.name = "Aswani";
		t.display(t);
		System.out.println(t.name);
	}
}
