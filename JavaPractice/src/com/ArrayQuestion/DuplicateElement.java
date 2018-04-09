package com.ArrayQuestion;

public class DuplicateElement {
	
	public static void main(String[] arg){
	int[] array={10,20,30,20,45,45,10,23,52};
	
	for (int i = 0;i<array.length;i++){
		for (int j=1;j<array.length;j++){
			if(array[i]!=array[j]){
				System.out.print(array[j]);
				break;
			}
			System.out.print(array[i]);
		}
	}
	

}
}
