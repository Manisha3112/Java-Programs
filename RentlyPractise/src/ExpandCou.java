import java.util.*;
public class ExpandCou {
	public static void main(String at[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sDi[]=s.split("[0-9]");
		String sLe[]=s.split("[a-z]");
		int iN[]=new int[sLe.length];
		int iC=0;
		for(int i=0;i<sLe.length;i++)
		{
			if(!sLe[i].equals("")) {
				iN[iC]=Integer.parseInt(sLe[i]);
				iC++;
			}
		}
		for(int i=0;i<sDi.length;i++)
		{
			for(int j=0;j<iN[i];j++)
			{
				System.out.print(sDi[i]);
			}
		}
			
		
	}

}
