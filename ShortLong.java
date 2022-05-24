package dailytask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShortLong {
	public static String smallLarge(String a, String b) {
		String c = "";
		if (a.length() > b.length()) {
			c = b + a + b;
			return c;

		}

		return c;

	}

	@Test
	public void testcase() {
		Assert.assertEquals(smallLarge("Hello", "Hi"), "HiHelloHi");

	}

}
