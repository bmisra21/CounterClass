/*
 * @author bmisra21
 */
public class TalleyCounter 
{
	//fields
	private int count;
	
	//constructors
	public TalleyCounter()
	{
		count = 0;
	}
	
	public TalleyCounter(int a)
	{
		count = a;
	}
	
	
	// methods
	public void click() 
	{
		count++;
	}
	
	public int getCount() //reset, unclick
	{
		return count;
	}
	
	public void reset()
	{
		count = 0;
	}
	public void unclick()
	{
		count--;
	}
}
