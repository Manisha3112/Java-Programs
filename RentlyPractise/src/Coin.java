import java.util.*;
public class Coin {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			int ch[]= {1,2,5};
			for(int i=0;i<t;i++)
			{
				int rem=0;
				
				int iN=sc.nextInt();
				int iCount=0;
				int n=iN;
				for(int j=2;j>=0;j--)
				{
					int sum=0;
					if(n>=ch[j])
					{
					sum=n/ch[j];
					rem=n%ch[j];
					n=rem;
					}
					iCount+=sum;
				}
				System.out.println(iCount);
			}
			

		}

	

}
