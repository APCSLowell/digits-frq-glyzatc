import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{  
	  digitList = new ArrayList <Integer> ();
	  if (num = 0)
	    digitList.add (0);
	  int n = num;
	  while (n > 0)
	    digitList.add (0, n%10);
	  n = n/10;
	}

	public boolean isStrictlyIncreasing()
	{ 
	  digitList = new ArrayList <Integer>();
	  String str = "" + num;
	  for (int i = 0; i < str.length(); i++)
		digitList.add(str.charAt (i) - '0');

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
