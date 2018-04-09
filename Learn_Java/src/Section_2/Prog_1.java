package Section_2;

public class Prog_1 {

	static int i;
	static void test(){
		System.out.println("Default value of i="+i);
		i=30;
		System.out.println("Default value of i="+i);
		i=20;
	}
	
	public static void main(String[] args) {
		System.out.println("Default value of i="+i);
		i=20;
		Prog_1.test();
		System.out.println("Default value of i="+i);
		
	}
}
