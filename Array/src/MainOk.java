

import java.util.*;	
public class MainOk
	{
	    private void swap(int[] number, int i, int j)
	    {
	        int temp  = number[i];
	        number[i] = number[j];
	        number[j] = temp;
	    }
	     
	    private void sortSubarray(int[] number, int i, int j)
	    {
	        // for this sub-array, all the digits would be in there reverse sorted position
	        while (i < j)
	        {
	            swap(number, i, j);
	            i += 1;
	            j -= 1;
	        }
	    }
	     
	    public void findNextGreaterNumber(int[] number)
	    {
	        int lastDigitSeen = number[number.length-1], i, j;
	        for (i = number.length-2; i >= 0; i--)
	        {
	            // if this digit is where the sorted ordering breaks 
	            if (lastDigitSeen > number[i])
	            {
	                break;
	            }
	            lastDigitSeen = number[i];
	        }
	         
	        if (i >= 0) // we found the digit breaking the sorted ordering
	        {
	            // find the next greater digit in the right sub-array from number[i+1 to end]
	            for (j = number.length-1; j > i; j--)
	            {
	                if (number[j] > number[i])
	                {
	                    break;
	                }
	            }
	             
	            // swap digits at indices 'i' and 'j'
	            swap(number, i, j);
	             
	            // sort the sub-array - number[i+1 to end]
	            sortSubarray(number, i+1, number.length-1);
	        }
	    }
	     
	     
	    public static void main(String[] args) 
	    {
	        MainOk solution = new MainOk();
	        
	         Scanner sc=new Scanner(System.in);
	        int l=3;
	        int number[]=new int[10];
	        for(int i=0;i<l;i++)
	        {
	        	number[i]=sc.nextInt();
	        }
	         
	        solution.findNextGreaterNumber(number);
	         
	        System.out.println("Next greater number is: ");
	        for (int i = 0; i < number.length; i++)
	        {
	            System.out.print(number[i]);
	        }
	    }
	
}
