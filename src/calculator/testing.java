package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddition {
	calculator obj = new calculator();
	@Test
	public void test0() {
		assertEquals(12,obj.add(2, 10));
	}
	@Test
	public void test1() {
		assertEquals(7,obj.add(3, 4));
	}
	@Test
	public void test2() {
		assertEquals(23,obj.add(5, 18));
	}
	@Test
	public void test3() {
		assertEquals(25,obj.add(14, 11));
	}

}
