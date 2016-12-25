/**
 * 
 */
package testIntrvw;

/**
 * @author Aastha Jain
 *
 */
public class EncircleRobot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[]{"G","L","R","L"};
		System.out.println(doesCircleExist(arr));

	}
	
	static String[] doesCircleExist(String[] commands){
		
		String[] validCircle=new String[commands.length];
		
		for( int i=0;i<validCircle.length ;i++){
			int x=0,y=0;
			String direction=commands[i];
			char intial ='N';
			for(int j=0;j<direction.length()*4;j++){  //MUltiplied by 4 because after every4 moves it return to starting point
				
				char dir=direction.charAt(j);
				switch(dir){
				case 'L':
					switch(intial){
					case 'N':
						intial='W';
					break;
					case 'E':
						intial='S';
						break;
					case 'W':
						intial='S';
						break;
					case 'S':
						intial='E';
						break;
					}
					break;
				case 'R':
					switch(intial){
					case 'N':
						intial='E';
					break;
					case 'E':
						intial='S';
						break;
					case 'W':
						intial='W';
						break;
					case 'S':
						intial='N';
						break;
					}
					break;
				case 'W':
					switch(intial){
					case 'N':
						y++;
					break;
					case 'E':
						x++;
						break;
					case 'W':
						x--;
						break;
					case 'S':
						y--;
						break;
					}
					break;
				}
			}
			if(x==0 && y==0){
				validCircle[i]="YES";
			}
			else{
				validCircle[i]="NO";
			}
		}
		
		
		return validCircle;
		
	}

}
