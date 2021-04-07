import java.util.*;
public class copyarray {
	public static void main(String ar[]) {
	int arr1[]= {1,2,2,3,1};
	int arr2[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	for(int j=0;j<arr2.length;j++)
	{
		System.out.println(arr2[j]);
	}

}
}
