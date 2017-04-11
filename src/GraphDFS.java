import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Aastha Jain
 *
 */
public class GraphDFS {

	static int row=8;
	static int col=8;
	static int adjacentMatrix[][];
	static boolean visited[];

	public GraphDFS(int r, int c) {
		this.row = r;
		this.col = c;
		this.adjacentMatrix = new int[r][c];
		this.visited = new boolean[r];
	}

	public static void DFSTraversal(int adjacentMatrix[][],boolean[] visited, int rowIndex) {
 
		if(rowIndex>=row) return ;
		
		boolean flag=false;
		
		for(int j=0;j<col;j++){
			if(adjacentMatrix[rowIndex][j]==1 && !visited[j]){
				
				System.out.print(letter(j)+" ");
				
				visited[j]=true;
				
				DFSTraversal(adjacentMatrix, visited, j);
			}
				
		}
		
		if(!flag)
			return;
		
	}

	
	private static String letter(int j) {
		if(j==0) return "A";
		else if(j==1) return "B";
		else if(j==2) return "C";
		else if(j==3) return "D";
		else if(j==4) return "E";
		else if(j==5) return "F";
		else if(j==6) return "G";
		else if(j==7) return "H";
		
		return "-1";
	}

	public static void main(String[] args) {
		int r=8;
		int c=8;
		GraphDFS graph = new GraphDFS(r, c);

		Scanner sc = new Scanner(System.in);
		adjacentMatrix=new int[][]
				{ {0,1,0,0,0,0,0,0},
				  {0,0,1,0,0,0,0,1},
				  {0,0,0,1,1,0,0,0},
				  {0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,1,1,0},
				  {0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0},
				};
				
		//visited=new boolean[r];
		
		visited[0]=true;
		
		System.out.println("The order of visiting the nodes :");
		DFSTraversal(adjacentMatrix,visited,0);
		
				

	}

}
