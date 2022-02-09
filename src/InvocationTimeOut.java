import org.testng.annotations.Test;

public class InvocationTimeOut {
@Test(invocationTimeOut=2)
public void TimeOut()
{
	int a =1;
	while(a==1)

{
	System.out.println("Invocation Time Out");
}}}