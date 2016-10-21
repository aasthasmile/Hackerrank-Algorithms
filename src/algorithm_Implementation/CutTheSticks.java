/**
 * 
 */
package algorithm_Implementation;

/**
 * @author Aastha Jain
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noofSticks = sc.nextInt();
		// int length[]=new int[noofSticks];
		ArrayList<Integer> length = new ArrayList<>();
		for (int i = 0; i < noofSticks; i++) {
			int a = sc.nextInt();
			length.add(i, a);
		}
		// System.out.println("Started");
		int lengthofcut = 0, sticklen = 0;
		int j = 0;

		while (length.size() != 0) {
			int countSticks = 0;
			lengthofcut = Collections.min(length);
			// System.out.println("length of cut:" + lengthofcut);
			for (int i = 0; i < length.size(); i++) {
				if (length.get(i) != 0) {
					countSticks++;
				}
				sticklen = length.get(i) - lengthofcut;
				length.set(i, sticklen);
				/*
				 * System.out.println("stick length:" + sticklen); if (sticklen
				 * > 0) length.set(i, sticklen); else if (sticklen == 0) {
				 * length.remove(i); }
				 */
			}
			while (length.contains(0)) {
				length.remove(new Integer(0));
			}
			System.out.println(countSticks);
		}

	}
}
