import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test (invocationCount=5) 
	public void Sum()
	{
		int i =5;
		int j=10;
		int l=i+j;
		System.out.println(l);
	}

}
