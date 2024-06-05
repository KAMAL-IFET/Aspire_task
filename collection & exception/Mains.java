package Collectionss;
import java.util.Queue;
import java.util.LinkedList;

public class Mains {

	public static void main(String[] args) {
		Queue<Integer>numbers=new LinkedList();
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println(numbers);
		
		
		//dequeue
		int removeNumber=numbers.poll();
		System.out.println(removeNumber);

	}

}
