import java.util.*;
public class UppMat {
	
	
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	        int iR=sc.nextInt();
	        
	        int iC=sc.nextInt();
	        int a[][]=new int[iR][iC];
	        
	        for(int i=0;i<iR;i++)
	            for(int j=0;j<iC;j++) {
	                
	                a[i][j]=sc.nextInt();
	            }
	    	        
	    	        for(int i=0;i<iR;i++)
	    	            for(int j=0;j<iC;j++)
	    	                if(i<j)
	    	                    System.out.print(a[i][j]+" ");
	    	    }
	    
	
}
