package test;

public class TestNG {
@BeforeMethod
public void setUp()
{
	System.out.println("Before Method");
}
@Test(prioriety=3,groups="google")
public void googleLogin()
{
	System.out.println("Google");
}
@Test(priority=2,groups="Yahoo")
public void yahooTest()
{
	System.out.println("Yahooo");
}
@test(prioriety=1,groups="google")
public void gmailAccount()
{
	System.out.println("Gmail");
}
@AfterTest
public void tearDown()
{
	System.out.println("Exit");
}
}
