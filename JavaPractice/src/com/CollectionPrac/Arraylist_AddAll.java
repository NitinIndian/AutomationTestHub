package com.CollectionPrac;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.common.collect.Iterables;

public class Arraylist_AddAll {

	public static void main(String args[]){

		try{

			//collection arr1	
			ArrayList<String> arr1=new ArrayList<String>();
			arr1.add("Infosys");
			arr1.add("Oracle");
			arr1.add("IBM");
			arr1.add("TCS");
			arr1.add("Wipro");
			arr1.add("CGI");
			arr1.add("");

			//collection arr2
			ArrayList<String> arr2=new ArrayList<String>();
			arr2.add("Flipkart");
			arr2.add("Amazon");

			//collection arr1 added to collection arr2
			arr1.addAll(arr2);

			//iterate the collection arr1 
			Iterator<String> it=arr1.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		catch(Exception E){
			System.out.println("Exception occurs");
		}

	}
}
