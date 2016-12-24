import java.util.Scanner;
import java.util.Stack;

public class StackBalanced {

	 public static boolean isBalanced(String expression) {
	        Stack<Character> stack=new Stack<Character>();
	        for(int i=0;i<expression.length();i++){
	        	char ch=expression.charAt(i);
	        	if(ch == '{') stack.push('}');
	        	if(ch == '[') stack.push(']');
	        	if(ch == '(') stack.push(')');
	        	//else if (ch=='}' || ch=='['|| ch=='(') return false;
			    else {
				  if (ch!= stack.peek() || stack.isEmpty()) 
					return false;
				
				 stack.pop();
			   }
	        
	       }
	        return stack.empty();
	        
	 	
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int a0 = 0; a0 < t; a0++) {
	            String expression = in.next();
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	        }
	    }

}
