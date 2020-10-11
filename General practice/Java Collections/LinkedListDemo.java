import java.util.*;
class LinkedListDemo{

	public static void main(String [] args){

		LinkedList l = new LinkedList();
		l.add("mayank");
		l.add("22");
		l.add(null);
		l.add("mayank");
		l.set(0,"software");
		l.add(0,"venky");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);//[CCC,venky,Software,22,null,mayank]

	}
}