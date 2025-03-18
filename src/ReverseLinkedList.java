class   ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        //sfasf
        // [1,2,3,4,5] 
        //1,2,3   
        /*
        curr=head; 1
         * next= curr.next; 2
         * prev=curr; 1
         * curr=next; 2
         */
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}   