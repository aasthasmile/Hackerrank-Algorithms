/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class nestParent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nestParen("(((x))"));
	}
	
	public static boolean nestParen(String str) {
		  if(str.isEmpty() || str.equals(" ")) return true;
		  System.out.println(str);
		  char firstchar=str.charAt(0);
		  char lastchar=str.charAt(str.length()-1);
		  int len=str.length()-1;
		  
		  if(firstchar=='(' && lastchar==')')
			 return nestParen(str.substring(1,len));
		  //return nestParen(str.substring(1));
		 return false;
				 
	}
	

}
