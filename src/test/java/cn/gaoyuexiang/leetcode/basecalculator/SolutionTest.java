package cn.gaoyuexiang.leetcode.basecalculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_get_right_answer() throws Exception {
		String expression = "(7)+1";
		int result = solution.calculate(expression);
		assertEquals(result, 8);
	}

	@Test
	public void without_parentheses() throws Exception {
		String experssion = "2+3+5-4";
		int result = solution.calculate(experssion);
		assertThat(result, is(6));
	}

	@Test
	public void multiplace_number() throws Exception {
		String expression = "24-( 8 - 4)";
		int result = solution.calculate(expression);
		assertEquals(result, 20);
	}
}