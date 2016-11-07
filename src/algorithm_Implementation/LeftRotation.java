/**
 * 
 */
package algorithm_Implementation;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int rotate_array[] = new int[(2*n)];
        for(int i=0;i<n;i++){
            rotate_array[i]=a[i];
            rotate_array[i+n]=a[i];
        }
        if(k>n){
        	k=k%n;
        }
        for(int i=k;i<k+n;i++){
            System.out.print(rotate_array[i]+" ");
        }
       
    }
}
