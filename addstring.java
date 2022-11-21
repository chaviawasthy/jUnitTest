package lab10package;

import static org.junit.Assert.*;

import org.junit.Test;

public class addstring {

	@Test
	public void test() {
		lab10functions junitString = new lab10functions();
		String result = junitString.addString("hi", "kaiseho");
		assertEquals("hikaiseho",result);
	}

}
