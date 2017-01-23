package Thread;

public class Vowels extends Thread {

	public static void main(String[] args) {
		Vowels v=new Vowels();
		v.start();
	}
	
	
	
	public void run(){
		
		String str="Aptech aeiou";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
				System.out.println(ch);
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
