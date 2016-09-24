import org.junit.Test;
import org.junit.Assert;

public class AssertFailExample {
	@Test
	public void DivideByZeroTest() {
		try {
			int result = 5 / 0;
			Assert.fail("Expected division by zero to throw exception.");
		} catch(Exception e) { }
	}
}