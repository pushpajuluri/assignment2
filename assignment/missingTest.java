package assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class missingTest {

	@Test
	public void test() {
		missing m=new missing();
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
			
				String result=m.miss(new int[]{1,3,4,5,6,7,10});
				arr.add(2);
				arr.add(8);
				arr.add(9);
				
				assertEquals("289",result);
				
				
			}

		
	}

