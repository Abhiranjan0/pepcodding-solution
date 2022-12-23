package xyz;
import java.util.*;

public class FloodFill {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int [][]maze=new int[n][m];
    for(int i=0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		maze[i][j]=s.nextInt();
    	}
    	
    }  
    boolean[][] vis=new boolean[n][m];
	Floodfilll(maze,0,0,"",vis);
    
	}
	public static void Floodfilll(int[][] maze,int sr,int sc,String psf,boolean[][] vis) {
		int dr=maze.length-1;
		int dc=maze[0].length-1;
		if(sr>dr||sc>dc||sr<0||sc<0|| maze[sr][sc]==1||vis[sr][sc]==true) {
			return;
		}
		if(sr==dr&&sc==dc) {
			System.out.println(psf);
			return;
		}
		vis[sr][sc]=true;
		Floodfilll(maze,sr-1,sc,psf+"t",vis);//top
		Floodfilll(maze,sr,sc-1,psf+"l",vis);//left
		Floodfilll(maze,sr+1,sc,psf+"d",vis);//down
		Floodfilll(maze,sr,sc+1,psf+"r",vis);//RIght
		vis[sr][sc]=false;
		
	}

}
