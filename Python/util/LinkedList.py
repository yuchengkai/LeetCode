#-*- encoding: utf-8 -*-
class ListNode:
	def __init__(self, x):
		self.val = x
		self.next = None
def genLinkedList(l):
"""
genLinkedList([integers]) -> linkedlist
"""
	if l==[]:
		return None
	else:
		length=len(l)
		if length==1:
			return ListNode(l[0])
		else:
			head=ListNode(l[0])
			h=head
			for i in range(1,length):
				h.next=ListNode(l[i])
				h=h.next
			return head
def printLinkedList(head):
	s=[]
	while head!=None:
		s.append(head.val)
		head=head.next
	print s
