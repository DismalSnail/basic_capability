/**
 * @author 冶鹏豪
 * @date 2021/3/25
 */

/**
 * Definition for singly-linked list.
 */

public class RemoveDulicatesFromSortedList {
    static class ListNode {
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

    ListNode createListFromArray(int[] nums) {
        ListNode head = new ListNode(-1);
        ListNode current = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            current = new ListNode(nums[i], current);
            head = current;
        }
        return head;
    }

    private void printList(ListNode head) {
        if (head == null) {
            return;
        }
        do {
            System.out.println(head.val);
            head = head.next;
        } while (head != null);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode adventure = current;
        while (current.next != null) {
            adventure = adventure.next;
            if (adventure.val == current.val) {
                while (adventure.next != null && adventure.val == adventure.next.val) {
                    adventure = adventure.next;
                }
                if (adventure.next == null) {
                    current.next = null;
                    return head;
                }
                current.next = adventure.next;
                current = current.next;
                adventure = current;
                continue;
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDulicatesFromSortedList re = new RemoveDulicatesFromSortedList();
        ListNode head = re.createListFromArray(new int[]{1, 1, 1, 2, 3});
        ListNode afterProcess = re.deleteDuplicates(head);
        re.printList(afterProcess);
    }
}
