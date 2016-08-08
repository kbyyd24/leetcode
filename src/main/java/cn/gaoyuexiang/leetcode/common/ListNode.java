package cn.gaoyuexiang.leetcode.common;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) {val = x;}

  public ListNode(int... nums) {
  	if (nums == null || nums.length < 1) {
			this.val = 0;
			return;
		}
  	this.val = nums[0];
    if (nums.length != 1) {
      this.next = new ListNode(nums[1]);
      ListNode p = this.next;
      for (int i = 2; i < nums.length; i++) {
        p.next = new ListNode(nums[i]);
        p = p.next;
      }
    }
	}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ListNode listNode = (ListNode) o;

    if (val != listNode.val) return false;
    return next != null ? next.equals(listNode.next) : listNode.next == null;

  }

  @Override
  public int hashCode() {
    int result = val;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    return result;
  }
}
