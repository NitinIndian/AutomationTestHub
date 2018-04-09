package Abstraction_Interface_Program;

abstract class Webdrivr{
	abstract void getURL();
	void getName(){
		System.out.println("GetName method for abstract class");
	}
}

public class Abstact_Firefox extends Webdrivr {
	void getURL(){
		System.out.println("GetURL method for Abstract class");
	}

	public static void main(String[] args) {
		Abstact_Firefox AFire=new Abstact_Firefox();
		AFire.getName();
		AFire.getURL();
	
	}

}
