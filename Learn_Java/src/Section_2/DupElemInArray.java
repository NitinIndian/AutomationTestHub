package Section_2;

public class DupElemInArray {

	public static void main(String[] args) {
	 int[] arr={10,20,10,20,54,63};
	 for(int i=0;i<=arr.length-1;i++){
		 for(int j=0;j<=arr.length-1;j++){
			 if(arr[i]>arr[j]){
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 
			 }
		 }
	for(int oi=0;oi<arr.length-1;oi++){	 
	 System.out.println(arr[oi]);
	 }
	 }

	}

}
