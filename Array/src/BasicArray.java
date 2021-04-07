import java.util.*;
public class BasicArray {
	public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
     int iSize=sc.nextInt();
     int iArr[]=new int[iSize];
     for(int i=0;i<iSize;i++)
{
	iArr[i]=sc.nextInt();
}
     for(int i=0;i<iSize;i++)
     {
    	 System.out.println(iArr[i]);
    	
    	}
     System.out.println(iArr.length);
  
    	}
     }