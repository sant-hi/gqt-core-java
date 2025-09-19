package com.gqt.corejava.challenges;
	class ListNode1 {
		int val;
		ListNode next;
		ListNode1(int val) {
		this.val = val;
		this.next = null;
		}
	}
		public class ReverseLinkedList {
		public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		System.out.println("Original Linked List:");
		printList(head);
		ListNode reversedHead = reverseList(head);
		System.out.println("Reversed Linked List:");
		printList(reversedHead);
		}
		private static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		ListNode next;
		while (current != null) {
		next =current.next;
		current.next = prev;
		prev =current;
		current =next;
		}
		return prev;
		}
		private static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
		System.out.print(current.val + " ");
		current= current.next;
		}
		System.out.println();
		}
		}

