package com.CollectionPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_RomoveAll {

	public static void main(String[] args) {
		//collection arr1
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Infosys");
		arr1.add("TCS");
		arr1.add("Wipro");

		//collection arr2
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Infosys");
		arr2.add("TCS");

		//RemoveAll from arr1
		arr1.removeAll(arr2);

		//iterate the arraylist 

		Iterator<String> it=arr1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
