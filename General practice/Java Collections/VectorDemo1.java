import java.util.*;
class VectorDemo1{
	public static void main(String[] args) {
		Vector v = new Vector();
		//Vector v = new Vector(10,5);
		System.out.println(v.capacity());//10
		for(int i=1;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v.capacity());//10
		v.addElement("A");
		System.out.println(v.capacity());//20
		System.out.println(v);//[1,2......10,A]
	}
}