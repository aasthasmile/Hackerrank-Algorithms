/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class powertoN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(powerN(3,8)+"");
	}
	
	public static int powerN(int base, int n) {
		  if(n==0) return 1;
		  else return base*powerN(base,n-1);
		}


}
