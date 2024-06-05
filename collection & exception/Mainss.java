package Collectionss;

import java.util.Stack;

public class Mainss {

	public static void main(String[] args) {
		Stack<String> employeeName = new Stack<String>();
		employeeName.push("Abel");
		employeeName.push("Bob");
		employeeName.push("KamaL");
		System.out.println(employeeName);
		employeeName.pop();
		
		System.out.println(employeeName);

	}

}
