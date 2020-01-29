import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;

public class Age1Test {
    Age1 age;
    @Before
    public void inti()
    {
    	age=new Age1();
    }
	@Test
	public void test() {
		assertEquals("eligible to vote",age.election(23));
	}

	@Test
	public void test1() {
		assertEquals("not eligible to vote",age.election(17));
	}

}
