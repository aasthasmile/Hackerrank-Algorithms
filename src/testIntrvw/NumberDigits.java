
package testIntrvw;
/**
 * @author Aastha Jain
 *
 */
public class NumberDigits {

	/*Q. If the number is given as 3 and the range is 5-23 then 
	 * print all the numbers between that range
	 * that contains number 3*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberDigits(3,5,23));
	}
	
	public static String numberDigits(int number,int start,int end){
		String num=String.valueOf(number);
		String str="";
		for(int i=start;i<=end;i++){
			if((String.valueOf(i)).contains(num)){
			 str=str+" "+String.valueOf(i);
			}
		}
		return str.trim();
	}

}
