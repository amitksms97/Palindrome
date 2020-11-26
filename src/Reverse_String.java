import java.util.*;

public class Reverse_String {

	Scanner sc=new Scanner(System.in);
	String str, revstr="";
	
	public Reverse_String()
	{
		System.out.println("Enter the string");
		str=sc.next();
	}
	
	public void reverse()
	{
		for(int i=str.length()-1; i>=0; i--)
		{
			revstr=revstr+str.charAt(i);
		}
		System.out.println("Reversed String: "+revstr);
	}
	public void palindrome()
	{
		if(str.equalsIgnoreCase(revstr))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is a not palindrome");
	}
	public static void main(String[] args) {
		Reverse_String obj=new Reverse_String();
		obj.reverse();
		obj.palindrome();
	}

}
