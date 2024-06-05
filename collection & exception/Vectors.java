package Collectionss;

import java.util.Vector;
import java.util.ArrayList;

public class Vectors {

	public static void main(String[] args) {
		Vector<String> employeeName = new Vector<String>();
		employeeName.add("Abel");
		employeeName.add("Bob");
		employeeName.add("Kamal");
		employeeName.add(1,"Kamal");
		System.out.println(employeeName);
		
		ArrayList<String> employeeName1 = new ArrayList<String>();
		employeeName1.add("Abel");
		employeeName1.add("Bob");
		employeeName1.add("Kamal");
		employeeName1.add(1,"Kamal");
		System.out.println(employeeName);
		employeeName.remove("Bob");
		
		
	}

}
