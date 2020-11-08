import java.util.*;
class CompareToDemo{
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));//-ve
		System.out.println("Z".compareTo("K"));//+ve
		System.out.println("A".compareTo("A"));//0
		System.out.println("A".compareTo(null));//RE:NPE
	}
}