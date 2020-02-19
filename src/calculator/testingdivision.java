package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testingdivision {

	calculator obj1 = new calculator();
	@Test
	void test0() {
		assertEquals(5,obj1.divide(10, 2));
	}
	@Test
	void test1() {
		assertEquals(-4,obj1.divide(8, -2));
	}	
	@Test
	void test2() {
		assertEquals(-3.5,obj1.divide(-7, 2));
	}
	@Test
	void test3() {
		assertEquals(3,obj1.divide(-9, -3));
	}
	@Test
	void test4() {
		assertEquals(5.5,obj1.divide(11, 2));
	}
	@Test
	void test5() {
		assertEquals(3,obj1.divide(3, 1));
	}
	@Test 
	void test6() {
		ArithmeticException thrown = assertThrows(ArithmeticException.class,() -> obj1.divide(7, 0));
		assertEquals("Error: Division by zero",thrown.getMessage());
	}

}
