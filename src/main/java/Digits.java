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
	{ /* to be implemented in part (b) */
		

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
