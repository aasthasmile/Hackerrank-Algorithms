package recursion1_codingbat;

public class countEight {

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println(count8(8818)+"");
	}
	
	
	public static int count8(int n) {
		  if(n==0) return 0;
		  if(n%100==88) return 2+count8(n/10);
		  if(n%10==8) return 1+count8(n/10);
		  return count8(n/10);
		}

	
}
