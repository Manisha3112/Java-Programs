import java.util.*;
public class SortDig {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		int iC=0;
		 iC+=Math.log10(iN)+1;
		int iB[]=new int[iC];
		int j=0; 
		
			while(iN>0 && j<iC)
			{
				iB[j]=iN%10;
				iN=iN/10;
				j++;
			}
		
		Arrays.sort(iB);
		for(int i=0;i<iC;i++)
		{
			System.out.print(iB[i]);
		}
	

	}

}
