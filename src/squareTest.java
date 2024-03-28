import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {		
			test t1 =new test();
			int testT1 = t1.square();
			assertEquals(25,testT1);		
	}
}
