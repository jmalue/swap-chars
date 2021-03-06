import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharsTest {

	@Test
	void swapStringwith2Chars() {
		assertEquals("AB",SwapChars.swap2("BA"));
	}
	@Test
	void swapStringwith6Chars() {
		assertEquals("fe",SwapChars.swap2("abcdef"));
	}
	@Test
	void swapStringwith1Char() {
		assertEquals("1",SwapChars.swap2("1"));
	}
	
	@Test
	void swapEmptyString() {
		assertEquals("",SwapChars.swap2(""));
	}
	
	
	
}
