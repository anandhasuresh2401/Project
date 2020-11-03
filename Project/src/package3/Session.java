package package3;

import java.util.Arrays;
import java.util.Scanner;
public class Session {
	void upper(String a)
	{
		StringBuffer updatedString = new StringBuffer();
	 char[] characters = a.toCharArray();
	 for(int index=0;index<characters.length;index++)
	 {
		 char c=characters[index];
		 if(index%2!=0)
		 {
			 c=Character.toUpperCase(c);
		 }
		 updatedString.append(c);
	 }
	 System.out.println("Modified string is:"+updatedString.toString());
	}
	
	void concatination(String a)
	{
		String s1=a;
		String s2=s1;
		String s3=s1.concat(s2);
		System.out.println(s3);
	}

	void inset(String a)
	{
		for(int i=0;i<=a.length();i++)
		{
			if(i%2!=0)
			{
				a=a.substring(0,i-1)+"#"+a.substring(i,a.length());
				
				
			}
		}
		System.out.println(a);
		
	}
	void dup(String a)
	{
		int res_ind=1,ip_ind=1;
		char arr[]=a.toCharArray();
		while(ip_ind!=arr.length)
		{
			if(arr[ip_ind]!=arr[ip_ind-1])
			{
				arr[res_ind]=arr[ip_ind];
				res_ind++;
				
			}
			ip_ind++;
			
		}
		a=new String(arr);
		System.out.println(a.substring(0,res_ind));
		
	}
	static String removeDuplicate(String a)
	{
		char temp[]=a.toCharArray();
		Arrays.sort(temp);
		a=new String(temp);
		return removeDuplicate(a);
	}
	public static void main(String[] args) {
	 Session t=new Session();
		t.dup("abbvxcsst");
		t.concatination("Hi Guys");
		t.inset("Hello");
		t.upper("xtv");
	}

}
