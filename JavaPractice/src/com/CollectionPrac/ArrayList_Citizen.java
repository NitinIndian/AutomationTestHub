package com.CollectionPrac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayList_AadarCard {

	int AadarNumber;
	String Name, Adddess;
	long Phn;

	public ArrayList_AadarCard(int AadarNumber,String Name,String Address,long Phn) {
		this.AadarNumber=AadarNumber;
		this.Name=Name;
		this.Adddess=Address;
		this.Phn=Phn;
	}
}
public class ArrayList_Citizen {

	public static void main(String[] args) {
		List<ArrayList_AadarCard> lst=new ArrayList<ArrayList_AadarCard>();

		ArrayList_AadarCard Citizen1=new ArrayList_AadarCard(123456, "Nitin Kushwah","Bangalore",903578261);
		ArrayList_AadarCard Citizen2=new ArrayList_AadarCard(123457, "Vartika Kushwah","Bangalore",903578268);
		ArrayList_AadarCard Citizen3=new ArrayList_AadarCard(123458, "Ankur Kushwah","Bangalore",903578269);
		ArrayList_AadarCard Citizen4=new ArrayList_AadarCard(123459, "Vani Kushwah","Bangalore",903578279);

		lst.add(Citizen1);
		lst.add(Citizen2);
		lst.add(Citizen3);
		lst.add(Citizen4);
		Iterator<ArrayList_AadarCard> it=lst.iterator();
		for(ArrayList_AadarCard aa:lst)
			System.out.println("Aadar Number=" +aa.AadarNumber+ ",Name=" +aa.Name+ ",Address=" +aa.Adddess+ ",Phone Number=" +aa.Phn+ "");
	}
}
