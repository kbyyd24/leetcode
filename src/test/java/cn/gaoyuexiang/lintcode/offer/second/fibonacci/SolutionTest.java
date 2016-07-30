package cn.gaoyuexiang.lintcode.offer.second.fibonacci;

import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_right() throws Exception {
		int result = solution.fibonacci(47);
		assert result == 1836311903;
	}
}