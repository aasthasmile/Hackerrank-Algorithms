package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class TopKFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=new int[]{1,2,3,1,1,2,2,3,2,2,2,3,3,3,3};
		System.out.println(topKFrequent(nums,2));
	}
	 public static List<Integer> topKFrequent(int[] nums, int k) {
		 
		 HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
			for (int i = 0; i < nums.length; i++) {
				if (hashmap.containsKey(nums[i])) {
					hashmap.put(nums[i], hashmap.get(nums[i]) + 1);
				} else {
					hashmap.put(nums[i], 1);
				}
			}
			List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(hashmap.entrySet());
			Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					return (o2.getValue().compareTo(o1.getValue()));
				}
			});

			int i=0;
			List<Integer> listk=new ArrayList<Integer>();
			for (Entry<Integer, Integer> entry : list) {
			       listk.add(entry.getKey());	
			       i++;
			       if(i==k) break;
			}
			System.out.println(listk.toString());
			
		    return listk;
	 }
}
