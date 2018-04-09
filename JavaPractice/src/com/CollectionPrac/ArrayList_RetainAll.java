package com.CollectionPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_RetainAll {

	public static void main(String[] args) {
		
		//Collection arr1
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Delhi");
		arr1.add("Bangalore");
		arr1.add("Ahmadabad");
		arr1.add("chennai");
		arr1.add("Kolktata");
		
		//collection arr2
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Delhi");
		arr2.add("Bangalore");
		
		//retain All
		arr1.retainAll(arr2);
		
		//Iterate the arraylist
		Iterator<String> it=arr1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
