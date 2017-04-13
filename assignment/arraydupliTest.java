package assignment;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class arraydupliTest {

	@Test
	public void test() {
		arraydupli ad=new arraydupli();
		HashSet<Integer> arr = new HashSet<Integer>();
	
	
			
				HashSet<Integer> result=ad.remove(new int[]{1,1,3,4});
				arr.add(1);
				arr.add(3);
				arr.add(4);
				
				assertEquals(arr,result);
				
	}

}
