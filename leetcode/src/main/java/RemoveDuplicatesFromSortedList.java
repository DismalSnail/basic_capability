/**
 * @author bitye
 * @data 2020/2/18
 * @time 20:35
 */
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) {
        val = x;
    }
}

public class RemoveDuplicatesFromSortedList {
    public ListNode2 deleteDuplicates(ListNode2 head) {
        if (head == null) {
            return head;
        }
        ListNode2 ahead = new ListNode2(head.val);
        ListNode2 p = ahead;
        ListNode2 q;
        ListNode2 second = head.next;
        while (second != null) {
            if (second.val != p.val) {
                p.next = new ListNode2(second.val);
                p = p.next;
            }
            second = second.next;
        }
        return ahead;
    }
}
