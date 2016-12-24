/**
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Aastha Jain
 *
 */
public class FrequencySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencySort("aastha");
		frequencySort2("tree");
	}
	
	
	public static String frequencySort(String s) {

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hashmap.containsKey(ch)) {
				hashmap.put(ch, hashmap.get(ch) + 1);
			} else {
				hashmap.put(ch, 1);
			}
		}
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(hashmap.entrySet());
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		});

		StringBuilder str = new StringBuilder();
		for (Entry<Character, Integer> entry : list) {
			// str.append(entry.getKey());
			for (int i = 0; i < entry.getValue(); i++)
				str.append(entry.getKey());
			// System.out.println(str.append(entry.getKey()));
		}
		System.out.println(str.toString());
		return str.toString();

	}
	public static String frequencySort2(String s) {
		 int[][] alphabets=new int[2][26];
		 for (int i = 0; i < 26; i++) {
				int ch = s.charAt(i);
				alphabets[0][ch-(int)'a']=(char)s.charAt(i);
				alphabets[1][ch-(int)'a']++;
		 }
		 for (int i = 0; i < 26; i++) {
			 System.out.println(alphabets[0][i]);
		 }
		 Arrays.sort(alphabets,new Comparator<int[]>() {
			 @Override
			public int compare(int[] o1, int[] o2) {
				return (o1.toString()).compareTo(o2.toString());
			 }
		});
		 StringBuilder str = new StringBuilder();
		 for (int i = 0; i < s.length(); i++) {
			 System.out.println(alphabets[i][0]);
			 str.append(alphabets[i][0]);
		 }
		 return str.toString();
		}
}
