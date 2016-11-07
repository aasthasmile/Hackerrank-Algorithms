/**
 * 
 */
package algorithm_Implementation;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class MakingAnagramUsingDeletion {

	public static int numberNeeded(String first, String second) {
		int[] alphabets=new int[26];
		
		for (int i = 0; i < first.length(); i++) {
			int ascii= first.charAt(i);
			if ( ascii >= 97 && ascii <= 122) {
				alphabets[ascii-(int)'a']++;
			}
		}
		for (int i = 0; i < second.length(); i++) {
			int ascii= second.charAt(i);
			if ( ascii >= 97 && ascii <= 122) {
				alphabets[ascii-(int)'a']--;
			}
		}
		int sum=0;
		for(int i=0;i<26;i++){
			sum=sum+Math.abs(alphabets[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		
	}
}
