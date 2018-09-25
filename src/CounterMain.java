
public class CounterMain {

	public static void main(String[] args) 
	{
		TalleyCounter counter1 = new TalleyCounter();
		
		counter1.click();
		System.out.println("Number of clicks after 1 click: " + counter1.getCount() );
		
		counter1.reset();
		System.out.println("Number of clicks after reset: " + counter1.getCount() );
		
		TalleyCounter counter2 = new TalleyCounter(50);
		System.out.println("Number of clicks in custom set counter: " + counter2.getCount() );
		
		counter2.unclick();
		System.out.println("Number of clicks in custom set counter after 1 unclick: " + counter2.getCount() );

	}

}
