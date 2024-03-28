import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class characterPrintTest {

	@Test
	void test() {
		characterPrint ch = new characterPrint();
		String ch1 = ch.getCharacter();
		
		assertEquals("abc",ch1);
	}

}
