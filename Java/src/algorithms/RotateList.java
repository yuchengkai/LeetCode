package algorithms;

import leetcode.ListNode;

public class RotateList {
	
	/**
	 * get the length of the linked list.
	 * move the pointer to the l-nth using two pointer.
	 * swap and concatenate the two parts.
	 * */
    public ListNode rotateRight(ListNode head, int k) {
        ListNode l1=head;
        int i=0;
        while(l1!=null){
            l1=l1.next;
            i++;
        }
        if(i<2)return head;
        k=k%i;
        if(k==0)return head;
        l1=head;
        i=k;
        while(i>1){
            l1=l1.next;
            i--;
        }
        ListNode prev=null;
        ListNode l2=head;
        while(l1.next!=null){
            prev=l2;
            l1=l1.next;
            l2=l2.next;
        }
        prev.next=null;
        l1.next=head;
        return l2;
    }
}
