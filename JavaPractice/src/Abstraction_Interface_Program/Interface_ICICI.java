package Abstraction_Interface_Program;


interface Bank{
	
	int i=10;
	void interest();
}
interface govBank{
	void govInterest();

}

class Interface_ICICI implements Bank,govBank {
	public void interest(){
		System.out.println("Interest rate of Icici 12%");
	}
	public void govInterest() {
		System.out.print("Interest rate of govBank 15%");
	}
	public static void main(String[] args) {
		Interface_ICICI icici=new Interface_ICICI();
		icici.interest();
		icici.govInterest();
	}

}
