import org.testng.annotations.Test;

public class ExceptionTest {
@Test(expectedExceptions=NumberFormatException.class)
public void NoException() {
	String i="120x";
	{
		Integer.parseInt(i);
		
	}
}
}
