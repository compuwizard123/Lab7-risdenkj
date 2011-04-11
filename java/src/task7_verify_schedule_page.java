import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class task7_verify_schedule_page extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://prodweb.rose-hulman.edu/regweb-cgi/reg-sched.pl");
		selenium.start();
	}

	@Test
	public void testTask7_verify_schedule_page() throws Exception {
		selenium.open("/regweb-cgi/reg-sched.pl");
		selenium.type("id1", "risdenkj");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CSSE376"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
