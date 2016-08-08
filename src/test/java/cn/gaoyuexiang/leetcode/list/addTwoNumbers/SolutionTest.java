package cn.gaoyuexiang.leetcode.list.addTwoNumbers;

import cn.gaoyuexiang.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
  
  private Solution solution = new Solution();

  @Test
  public void should_return_a_list() throws Exception {
    ListNode l1 = new ListNode(2, 4, 3);
    ListNode l2 = new ListNode(5, 6, 4);
    ListNode ret = new ListNode(7, 0, 8);
    ListNode result = solution.addTwoNumbers(l1, l2);
    assertEquals(ret, result);
  }
}