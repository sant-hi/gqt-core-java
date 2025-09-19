package com.gqt.corejava.collection;
import java.util.LinkedList;
public class LinkedListCode1 {
	    public static void main(String[] args) {
	        LinkedList ll = new LinkedList();
	        // inserting the data
	        ll.add(100);
	        ll.add(50);
	        ll.add(150);
	        ll.add(25);
	        ll.add(125);
	        ll.add(75);
	        ll.add(175);
	        System.out.println(ll);

	        ll.add("Kohli");
	        ll.add(678.56f);
	        ll.add('d');
	        ll.add(true);
	        System.out.println(ll);

	        ll.add(2, 1111);
	        System.out.println(ll);

	        ll.set(2, 2222);
	        System.out.println(ll);

	        ll.addFirst(9898);
	        ll.addLast(8989);
	        System.out.println(ll);

	        LinkedList ll1 = new LinkedList();
	        ll1.add("Samantha");
	        ll1.add("Katrina");
	        ll1.add("Aishwarya");
	        System.out.println(ll1);

	        ll.add(ll1);   // nested list
	        ll.addAll(ll1); // merge elements
	        System.out.println(ll);

	        ll.addAll(3, ll1);
	        System.out.println(ll);

	        // clone
	        LinkedList ll_clone = (LinkedList) ll.clone();
	        System.out.println(ll_clone);

	        boolean res1 = ll.contains(100);
	        System.out.println(res1);

	        res1 = ll.contains(101);
	        System.out.println(res1);

	        res1 = ll.containsAll(ll1);
	        System.out.println(res1);

	        int size = ll.size();
	        System.out.println(size);

	        System.out.println(ll.getClass());
	        System.out.println(ll.getFirst());
	        System.out.println(ll.getLast());

	        int hashCode = ll.hashCode();
	        System.out.println(hashCode);

	        int indexOf = ll.indexOf("Aishwarya"); // corrected spelling
	        System.out.println(indexOf);

	        int lastIndexOf = ll.lastIndexOf("Aishwarya");
	        System.out.println(lastIndexOf);

	        boolean empty = ll.isEmpty();
	        System.out.println(empty);

	        ll1.clear();
	        empty = ll1.isEmpty();
	        System.out.println(empty);

	        Object remove = ll.remove(0); // remove by index
	        System.out.println(remove);
	        System.out.println(ll);

	        Object rm = 2222;
	        remove = ll.remove(rm); // remove by object
	        System.out.println(remove);
	        System.out.println(ll);

	        boolean removeAll = ll.removeAll(ll1);
	        System.out.println(removeAll);
	        System.out.println(ll);

	        ll.removeFirst();
	        ll.removeLast();
	        System.out.println(ll);
	    }
	}


