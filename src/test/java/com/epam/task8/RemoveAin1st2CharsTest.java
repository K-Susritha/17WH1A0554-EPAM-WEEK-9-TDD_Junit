package com.epam.task8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAInFirst2CharTest {
	
	/*TODO List
	 * 1. 1st char is A             "ABCD" ==> "BCD"
	 * 2. 2nd char is A             "BACD" ==> "BCD"
	 * 3. 1st and 2nd char are A   	"AABC" ==> "BC"
	 * 4. No A in 1st and 2nd char  "BBAA" ==> "BBAA"
	 * 5. N char                    "AABAA" ==> "BBAA"
	 * 6. Empty                     ""      ==> ""
	 * 7. 1 A                       "A"     ==> """
	 * 8. ALL As                    "AAAAA" ==> "AAA"
	 * 9. 1 B 						"B" 	==> "B"
	 */
	
	RemoveAin1st2Chars remAin2Char;
	
	@BeforeEach
	void setUp() {
		remAin2Char = new RemoveAin1st2Chars();
	}

	@Test
	void testFirstChar() {
		assertEquals("BCD", remAin2Char.remove("ABCD"));
	}
	
	@Test
	void testSecondChar() {
		assertEquals("BCD", remAin2Char.remove("BACD"));
	}
	
	@Test
	void testBothChar() {
		assertEquals("BC", remAin2Char.remove("AABC"));
	}
	
	@Test
	void testNoChar() {
		assertEquals("BBAA", remAin2Char.remove("BBAA"));
	}
	
	@Test
	void testNChar() {
		assertEquals("BAA", remAin2Char.remove("AABAA"));
	}
	
	
	@Test
	void testEmpty() {
		assertEquals("", remAin2Char.remove(""));
	}
	
	@Test
	void testSingleChar() {
		assertEquals("", remAin2Char.remove("A"));
	}
	
	@Test
	void testAllChar() {
		assertEquals("AAA", remAin2Char.remove("AAAAA"));
	}
	
	@Test
	void testOneChar() {
		assertEquals("B", remAin2Char.remove("B"));
	}
}