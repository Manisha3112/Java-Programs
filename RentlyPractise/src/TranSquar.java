import java.util.*;
public class TranSquar {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int row=sc.nextInt();
			int col=sc.nextInt();
	        int m[][]=new int[row][col];
	        if(row==col) {
	        for(int i=0;i<row;i++) {
	        	for(int j=0;j<col;j++) {
	        		m[i][j]=sc.nextInt();
	        	}
	        }
	        for(int i=0;i<row;i++) {
	        	for(int j=0;j<col;j++) {
	        		System.out.print(m[j][i]+" ");
	        	}
	        	System.out.println();
	        }
	        }
	        else {
	        	System.out.println("Not a square matrix");
	        }
		}

	
}
