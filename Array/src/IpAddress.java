//2.
//
//rite a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
//
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
//In this problem you will be provided strings containing any combination 
//of ASCII characters. You have to write a regular expression to find the 
//valid IPs.
//
//Sample Input
//
//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP
//Sample Output
//
//true
//true
//true
//false
//false
//false

import java.util.*;
public class IpAddress {
	public static void main(String aff[])
	{
		class myRegex
		{
		    String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		           
		}
		
	}

}
