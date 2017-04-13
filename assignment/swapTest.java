package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class swapTest {

	@Test
	public void test() {
		swap s=new swap();
		String result=s.swapnn(4,7);
		assertEquals("74",result);
	}

}
