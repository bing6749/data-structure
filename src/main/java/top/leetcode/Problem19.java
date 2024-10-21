package top.leetcode;
/*
 * @author  MaRui
 * @date  2024/8/4 15:50
 * @version 1.0
 */


/**
 * 19. 删除链表的倒数第 N 个结点
 *
 * @author MaRui
 */
public class Problem19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 通过遍历一次链表，找到倒数第 n 个节点，
     * 然后再遍历一次链表删除该节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode headNode = new ListNode(-1, head);
        ListNode originalHead = headNode;
        int sum = 0;
        while (headNode.next != null) {
            headNode = headNode.next;
            sum++;
        }
        int count = sum - n;
        headNode = originalHead; // 恢复 headNode 为原始头节点
        sum = 0;
        while (headNode.next != null) {
            if (count == sum) {
                headNode.next = headNode.next.next;
                break;
            }
            headNode = headNode.next;
            sum++;
        }
        return originalHead.next;
    }

    /**
     * 通过双指针法，只需遍历一次链表
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode first = dummy;
        ListNode second = dummy;
        // 先将 first 指针移动 n 个节点
        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }
        // 然后同时移动 first 和 second 指针
        while(first != null){
            first = first.next;
            second = second.next;
        }
        // 删除倒数第 n 个节点
        second.next = second.next.next;
        return dummy.next;
    }
}
