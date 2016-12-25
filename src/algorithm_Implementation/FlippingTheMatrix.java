package algorithm_Implementation;

import java.util.Scanner;

public class FlippingTheMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
        for(int k=0;k<testcase;k++){
		int n = in.nextInt();
		int h[][] = new int[2 * n][2 * n];
		
		for (int i = 0; i < 2 * n; i++) {
			for (int j = 0; j < 2 * n; j++) {
				h[i][j] = in.nextInt();
			}
		}
		int max_a=0,sum=0;
		
		
		//The maximum of 
		// a1 a2 b1 b2
		// a3 a4 b3 b4
		// c1 c2 d1 d2
		// c3 c4 d3 d4
		
		//max a1= max(a1,b2,c3,d4)  corner elements will replace a1 after any number of rotations
		//max a2= max(a2,b1,c4,d3)  similarly others
		//max a3= max(a3,b4,c1,d2)
		//max a4= max(a4,b3,c2,d1)
		
		for (int i = 0; i < 2 * n; i++) {
			for (int j = 0; j < 2 * n; j++) {
					max_a=Math.max(Math.max(h[i][j], h[i][2*n-1-j]),Math.max(h[2*n-1-i][j], h[2*n-1-i][2*n-1-j]));
					sum+=max_a;
			}
			}
		System.out.println(sum);
        }
	}

}
