import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class task4_recording_tests extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://webtesting.idyll.org/");
		selenium.start();
	}

	@Test
	public void testTask4_recording_tests() throws Exception {
		selenium.open("/");
		selenium.click("link=Log in");
		selenium.waitForPageToLoad("30000");
		selenium.click("create");
		selenium.waitForPageToLoad("30000");
		selenium.type("name", "test_risdenkj");
		selenium.type("username", "test_risdenkj");
		selenium.type("password", "test");
		selenium.click("create");
		selenium.waitForPageToLoad("30000");
		selenium.type("username", "test_risdenkj");
		selenium.type("password", "test");
		selenium.click("login");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("Welcome, test_risdenkj"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
