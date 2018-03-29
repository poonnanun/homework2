import java.util.ArrayList;
import java.util.List;

/**
 * Home work2 recusion
 * @author Poonnanun Poonnopathum
 *
 */
public class Recusion {
	
	/**
	 * Unique class use for return new list that have removed the duplicated item
	 * @param list
	 * @return new list
	 */
	public static List<String> unique(List<String> list){
		if(list.size() == 1) return list;
		String temp = list.get(0);
		list.remove(0);
		if(list.contains(temp))	return unique(list);
		List<String> newList = new ArrayList<>();
		newList.add(temp);
		List<String> recusive = unique(list);
		newList.addAll(recusive);
		return newList;
		
	}
	
	/**
	 * Old fibonacci that slow
	 * @param n
	 * @return result fibonacci number
	 */
	public static long fibonacci(int n){
		if(n==0) return 0;
		if(n<=2) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/**
	 * new fibonacci that faster
	 * @param number
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return result of fibonacci
	 */
	public static long newFibonacci(int number){
		return recusiveHelper(number, 0, 0, 0);
	}
	
	/**
	 * Helper method for new fibonacci
	 * @param number
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return result
	 */
	public static long recusiveHelper(int number, int n1, int n2, int n3){
		if(number<1) return n3;
		if(n1<1 && n2<1) n3 = 1;
		else n3 = n1+n2;
		n2 = n1;
		n1 = n3;
		return recusiveHelper(number-1, n1, n2, n3);
	}
	
	public static void main(String[] args){
		System.out.println(newFibonacci(48));
		System.out.println(fibonacci(48));
	}
}
