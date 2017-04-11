/**
 * 
 */
package Code30;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Day8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			if (!map.containsKey(name))
				 map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if(map.containsKey(s)){
				System.out.println(s+"="+map.get(s));
			}
			else
				System.out.println("Not found");
		}
		in.close();
	}
}
