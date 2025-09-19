package com.gqt.corejava.challenges;
class ListNode {
int val;
ListNode next;
ListNode(int val) {
this.val= val;
this.next=null;
}
}
public class Intersectionpoint {
public static void main(String[] args) {
ListNode commonNode= new ListNode(7);
ListNode list1= new ListNode(1);
list1.next=new ListNode(2);
list1.next.next=commonNode;
ListNode list2 = new ListNode(3);
list2.next= commonNode;
ListNode intersectionNode = findIntersection(list1, list2);
if (intersectionNode != null) {
System.out.println("Intersection point value: " + intersectionNode.val);
} else {
System.out.println("No intersection point found.");
}
}
private static ListNode findIntersection(ListNode headA, ListNode headB) {
ListNode pointerA = headA;
ListNode pointerB = headB;
while (pointerA != pointerB) {
pointerA= (pointerA != null)? pointerA.next: headB;
pointerB =(pointerB != null) ? pointerB.next: headA;
}
return pointerA;
}
}
