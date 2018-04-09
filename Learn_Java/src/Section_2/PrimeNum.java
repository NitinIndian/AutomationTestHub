package Section_2;

public final class PrimeNum {

	public static void main(String[] args) {
		int n, count = 0;	
		for(n=2;n<100;n++) 
		{
			int flag=0;
		     for(int i=2;i<=n/2;i++)
		     	{
		    	 if(n%i==0)
		    	 {
		    		 flag=1;
		    		 break;
		    	 }
		    	 if(flag==0)	
		    	 {
		    		 count++;
		    	 }   	 
		 }
		     System.out.println(count);
}
		/*else
		{
			System.out.println("Number is not prime");
		}*/
			
		
		

	}

}
