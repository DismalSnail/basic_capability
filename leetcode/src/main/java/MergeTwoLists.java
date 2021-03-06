class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoLists {


    /**
     * NAME: Merge Two Sorted Lists
     * Description:
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the
     * first two lists.
     * <p>
     * Example:
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode list = new ListNode(-1);
        list.next = null;
        ListNode iList = list;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                list.next = l2;
                list = list.next;
                l2 = l2.next;
            } else {
                list.next = l1;
                list = list.next;
                l1 = l1.next;
            }
        }

        if (l1 == null) {
            list.next = l2;
        } else {
            list.next = l1;
        }

        iList = iList.next;
        return iList;
    }
}
