package abstarctClass;

abstract class AbstractTest3
{
	abstract public void abstractDemoTest3();
}
class AbstractClass extends AbstractTest3
{

	@Override
	public void abstractDemoTest3() {
	
		System.out.println("Method Overridden");		
	}
	
}
public class AbstractClass3
{
	public static void main(String[] args) 
	{
		AbstractTest3 as = new AbstractClass();
		as.abstractDemoTest3();
	}

}
