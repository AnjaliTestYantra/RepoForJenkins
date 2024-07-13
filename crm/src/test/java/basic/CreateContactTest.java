package basic;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void contactTest() {
		System.out.println("Executed contactTest");
		String BROWSER = System.getProperty("browser");
		String uname = System.getProperty("username");
		String pwd = System.getProperty("password");
		String URL = System.getProperty("url");
		System.out.println("Browser is: "+BROWSER);
		System.out.println("Username used is: "+uname);
		System.out.println("Password used is: "+pwd);
		System.out.println("Url is: "+URL);

	}

}
