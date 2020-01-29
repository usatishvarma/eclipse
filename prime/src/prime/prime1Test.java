package prime;

import static org.junit.Assert.*;

import org.junit.Test;

public class prime1Test {

	@Test
	public void test() {
		prime1 p=new prime1();
		assertEquals(true,p.primenumbercheck(19));
	}

}
