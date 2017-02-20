/**
 * 
 */
package universityCodesprint2;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class SeperateNumbers {

	/**
	 * @param args
	 *            string=9101112
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();

			boolean flag = true;
			int first=0;
			for (int i = 1; i < s.length() / 2; i++) {
				first = Integer.parseInt(s.substring(0, i));
				System.out.println(first);
				int k = 1;
				for (int j = i; j < s.length(); j++) {
					
					System.out.println(Integer.toString(first + (k++))+" !="+ s.substring(j, j + i));
					if (Integer.toString(first + (k++)).equals(s.substring(j, j + i)))
						flag = true;
					else{
						flag=false;
						break;
					}
					
				 System.out.println("loop "  +j+"flag = "+flag);
					
				}

			}

			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
