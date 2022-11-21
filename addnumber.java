package lab10package;

import static org.junit.Assert.*;

import org.junit.Test;

public class addnumber {

	@Test
	public void test() {
		lab10functions junit = new lab10functions();
		int result = junit.addnumber(100, 200);
		assertEquals(300,result);
	}

}
