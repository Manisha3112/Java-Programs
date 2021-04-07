
public class duplicate {
	public static void main(String arg[]) {
		int iAr[]=new int[] {1,2,1,2,3,4};
		for(int i=0;i<iAr.length;i++)
		{
			for(int j=i+1;j<iAr.length;j++)
			{
			if(iAr[i]==iAr[j])
			System.out.println(iAr[j]);
		}
	}
	}

}
