package assignment;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class mergesortTest {

	@Test
	public void test() {
        mergesort m=new mergesort();
		ArrayList<Integer>p=new ArrayList<Integer>();
ArrayList<Integer> result=m.merge(new int[]{2,4,5},new int[]{3,6,7});
p.add(2);
p.add(3);
p.add(4);
p.add(5);
p.add(6);
p.add(7);
assertEquals(p,result);


}
	}


