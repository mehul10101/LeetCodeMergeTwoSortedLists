class Scratch {
    //Merge Two Sorted Lists - January problems

    //Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists
    public static void main(String[] args) {

        // creating data
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(7);
        mergeTwoLists(l1, l2);

    }

    /**
     * merging two sorted list and returning list
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2, merge = new ListNode(0);
        // we are going to manipulate merge list so we make a ans which will be equal to merge
        ListNode ans = merge;
        // till one of the list is null add the lowest element from the list
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                merge.next = new ListNode(t1.val);
                t1 = t1.next;
            } else {
                merge.next = new ListNode(t2.val);
                t2 = t2.next;
            }
            merge = merge.next;
        }

        // if one of them get null, directly assign all the values of other list to merge
        if (t1 == null) {
            merge.next = t2;
            return ans.next;
        }

        if (t2 == null) {
            merge.next = t1;
            return ans.next;
        }

        // returning the next value as we initialized it with a node of value 0
        return ans.next;

    }

    // Definition for singly-linked list.
    public static class ListNode {
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
}



