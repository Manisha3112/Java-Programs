
public class frequency {
public static void main(String arg[]) {
	int iAr[]= new int[]{1,2,2,2,1,3,4,5,5};
	int visited=-1;
	
	int fr[]=new int[iAr.length];
	for(int i=0;i<iAr.length;i++)
	{
		int count=1;
		for(int j=i+1;j<iAr.length;j++)
		{
		if(iAr[i]==iAr[j]) {
			count++;
		fr[j]=visited;
		}
	}
		if(fr[i]!=visited)
			fr[i]=count;
	}
	for(int i=0;i<fr.length;i++) {
		if(fr[i]!=visited) {
			System.out.println("num:"+iAr[i]+" contains frequency "+fr[i]);
		}}}
}
