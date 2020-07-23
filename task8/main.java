package TDDJUNIT;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAcharacters {
	/*TODO list for the application
	 * 1.one A character:"ABCD"=>"BCD"-success
	 * 2.two consecutive A characters:"AACD"=>"CD"-success
	 * 3.second character is A:"BACD"=>"BCD"-success
	 * 4.last two characters are A:"BBAA"=>"BBAA"-success
	 * 5.first two and last two are A's:"AABAA"=>"BAA"-success
	 */
	Remove2characters r;
	@BeforeEach
	void start() {
		r= new Remove2characters();
	}
	@Test
	void remove1character() {
		assertEquals("BCD",r.removeA("ABCD"));
	}
	@Test
	void remove2character() {
		assertEquals("CD",r.removeA("AACD"));
	}
	@Test
	void removeseccharacter() {
		assertEquals("BCD",r.removeA("BACD"));
	}
	@Test
	void remaincharacter() {
		assertEquals("BBAA",r.removeA("BBAA"));
	}
	@Test
	void firstlastcharacter() {
		assertEquals("BAA",r.removeA("AABAA"));
	}
	
}