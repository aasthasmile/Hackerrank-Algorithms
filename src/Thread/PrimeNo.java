package Thread;

import java.util.Scanner;

public class PrimeNo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo prime = new PrimeNo();
		Thread t1 = new Thread(prime);
		t1.start();

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int number2 = sc.nextInt();

		for (int i = number1; i <= number2; i++) {

			if(primeTest(i))
				System.out.println(i+" is Prime");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public boolean primeTest(int n){
		boolean flag=true;
		for (int j = 2; j < n; j++) {
			if (n % j == 0){
				flag=false;
				break;
			}
				
		}
		return flag;
	}

}
