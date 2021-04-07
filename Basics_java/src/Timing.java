import java.util.*;
public class Timing {
	public static void main(String arm[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		String sp[]=str.split(",");
		String sl[]=sp[0].split(":");
		String nu[]=sp[1].split("-");
		
		
		    int mi=Integer.parseInt(String.valueOf(sl[1]));
			int se=Integer.parseInt(String.valueOf(sl[2]));
			int m=mi*60;
			int to=m+se;
			int ans=0;
			
			if(to<300)
			{
				ans=to*3;
			}
			if(to==300)
			{
				ans=mi*150;
			}
			if(to>300)
			{
				ans=(mi+1)*150;
			}
			
			System.out.println(ans);
		
		
	}

}
