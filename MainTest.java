import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
	Main m;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new Main();
	}

	@Test
	void testReturnuserNums() {
		List numList = m.returnuserNums(10);
		ArrayList<Integer> output = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			output.add(i, i);
		}
		ArrayList<Integer> expectedOutput = output;
		assertEquals(expectedOutput, numList);
	}

	@Test
	void testReturnErrorMessage() {
		String message = m.returnErrorMessage();
		
		String errorMessage = "The size of your list is larger than the allowed ";
		assertEquals(errorMessage, message);
	}

	@Test
	void testTrimToExactSize() {
		Integer output = m.trimToExactSize();
		Integer num = 300000;
		assertEquals(num,output);
	}

}
