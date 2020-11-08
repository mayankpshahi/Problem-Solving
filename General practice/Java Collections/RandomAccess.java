
import java.util.*;
class RandomAccess{
	public static void main(String[]args){
	ArrayList l1 = new ArrayList();
LinkedList l2 = new LinkedList();
System.out.println(l1 instanceof Serializable);//true
System.out.println(l1 instanceof Cloneable);//true
System.out.println(l1 instanceof RandomAccess);//true
System.out.println(l1 instanceof RandomAccess);//false

	}
}