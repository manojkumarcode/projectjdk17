package com.manoj.projectjdk17.google;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution obj = new Solution();
        obj.addTwoNumbers(l1, l2);

    }

}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;

        int carryOver = 0;

        while (l1 != null || l2 != null) {

            while (l1 != null && l2 != null) {

                int value = l1.val + l2.val + carryOver;
                carryOver = value / 10;
                int sum = value % 10;

                ListNode l3 = new ListNode(sum, null);

                if (head == null) {
                    head = l3;
                    current = head;
                } else {
                    current.next = l3;
                    current = current.next;
                }
                l1 = l1.next;
                l2 = l2.next;
            } // 2nd while end

            while (l1 != null) {
                ListNode l3 = new ListNode(l1.val, null);
                if (head == null) {
                    head = l3;
                } else {
                    head.next = l3;
                }
                l1 = l1.next;
            }

            while (l2 != null) {
                ListNode l3 = new ListNode(l2.val, null);

                if (head == null) {
                    head = l3;
                } else {
                    head.next = l3;
                }
                l2 = l2;
            }
        } // first while end
        return head;
    }
}


/**
 * Definition for singly-linked list.
 */
class ListNode {
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



