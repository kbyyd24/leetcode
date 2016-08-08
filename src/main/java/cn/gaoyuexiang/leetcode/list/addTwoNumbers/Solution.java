package cn.gaoyuexiang.leetcode.list.addTwoNumbers;

import cn.gaoyuexiang.leetcode.common.ListNode;


/**
 * issues : #21
 */

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    int carry = 0;
    ListNode ret = new ListNode(0), p = ret;
    while (l1 != null && l2 != null) {
      int sum = l1.val + l2.val + carry;
      if (sum >= 10) {
        sum -= 10;
        carry = 1;
      } else {
        carry = 0;
      }
      p.next = new ListNode(sum);
      p = p.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    if (l2 != null) {
      p.next = l2;
    } else if (l1 != null) {
      p.next = l1;
    }
    dealCarry(carry, p);
    return ret.next;
  }

  private void dealCarry(int carry, ListNode p) {
    while (carry == 1) {
      if (p.next != null) {
        p = p.next;
        p.val ++;
        if (p.val >= 10) {
          p.val -= 10;
        } else {
          break;
        }
      } else {
        p.next = new ListNode(1);
        break;
      }
    }
  }
}
