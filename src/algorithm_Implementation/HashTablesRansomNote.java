/**
 * 
 */
package algorithm_Implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class HashTablesRansomNote {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
           // System.out.println(magazine[magazine_i]);
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        for (int i = 0; i < magazine.length; i++) {
			if (hashMap.containsKey(magazine[i])) {
				hashMap.put(magazine[i], hashMap.get(magazine[i]) + 1);
			} else {
				hashMap.put(magazine[i], 1);
			}
		}
        boolean flag = true;
        for (int i = 0; i < ransom.length; i++) {
        	if(hashMap.containsKey(ransom[i]) && hashMap.get(ransom[i]) > 0){
        		hashMap.put(ransom[i], hashMap.get(ransom[i])-1);
        	} else {
        		flag = false;
        		break;
        	}
        }
       
        System.out.println(flag==false?"No":"Yes");
    }
}
