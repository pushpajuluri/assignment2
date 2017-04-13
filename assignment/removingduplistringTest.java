package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class removingduplistringTest {

	@Test
	public void test() {
		removingduplistring rd=new removingduplistring();
		String result=rd.removi(new int[]{1,1,2,3,4,5});
		assertEquals("12345",result);
	}

}
