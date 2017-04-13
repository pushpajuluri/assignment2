package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import omini.palindrome;

public class palindrometest {

	@Test
	public void test() {
		palindrome p=new palindrome();
		boolean result=p.isPalindrome("malayalam");
		assertEquals(result,true);
	}

}
