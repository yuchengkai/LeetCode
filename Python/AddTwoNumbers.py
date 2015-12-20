from util.LinkedList import ListNode,genLinkedList,printLinkedList
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        c=0
        head=ListNode(0)
        h=head
        while l1!=None and l2!=None:
            t=l1.val+l2.val+c
            c=t/10
            h.next=ListNode(t%10)
            l1=l1.next
            l2=l2.next
            h=h.next
        if l1==None:
            l1=l2
        while l1!=None:
            t=l1.val+c
            c=t/10
            h.next=ListNode(t%10)
            l1=l1.next
            h=h.next
        if c==1:
            h.next=ListNode(1)
        return head.next
s=Solution()
l1=genLinkedList([2,4,3])
l2=genLinkedList([5,6,4])
l3=s.addTwoNumbers(l1,l2)
printLinkedList(l3)