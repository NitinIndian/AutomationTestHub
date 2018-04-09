package Section_2;

public class ReverseString {
	 
	public static void main(String[] args) {
		String Str2="Nitin";
		char[] ch=Str2.toCharArray();
		String rev="";
		int len=ch.length-1;
		for(int i=len;i>=0;i--){
			
			rev+=ch[i];
		}
		System.out.println(rev);
		if(Str2.equalsIgnoreCase(rev)){
			System.out.println("Strinn is palindrom");
		}
		else{
			System.out.println("String is not palindrom");
		}
}
	
}
