import java.util.*;
public class Duplicta {
            public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int v=0;
			int iN=sc.nextInt();
			int iAr[]=new int[iN];
			for(int i=0;i<iN;i++)
			{
			    iAr[i]=sc.nextInt();
			}
			for(int i=0;i<iN;i++)
			{
				int c=0;
			  for(int j=i+1;j<iN;j++)
			  {
			      if(iAr[i]==iAr[j])
			          c++;
			  }
			  if(c>0)
			  {
				  System.out.println(iAr[i]);
				  v=1;
			  }
			}
			if(v==0)
			System.out.println("No duplicate");
		}
}