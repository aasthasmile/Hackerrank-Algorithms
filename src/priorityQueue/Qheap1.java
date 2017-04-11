/**
 * 
 */
package priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Qheap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PriorityQueue<Integer> heap=new PriorityQueue<>();
    Scanner sc=new Scanner(System.in);
    int testcases=sc.nextInt();
    for(int i=0;i<testcases;i++){
    	int operation=sc.nextInt();
    	if(operation==1){
    		int data=sc.nextInt();
    		heap.add(data);
    	}
    	if(operation==2){
    		int data=sc.nextInt();
    		heap.remove(data);
    	}
    	else if(operation==3){
    		System.out.println(heap.peek());
    	}
    	
    }
	}

}
