package com.gqt.corejava.collection;
import java.util.ArrayDeque;
public class ArrayDequeueCode1 {
	    public static void main(String[] args) {
	        ArrayDeque ad = new ArrayDeque();

	        // inserting the data
	        ad.add(100);
	        ad.add(50);
	        ad.add(150);
	        ad.add(25);
	        ad.add(125);
	        ad.add(75);
	        ad.add(175);
	        System.out.println(ad);

	        // add different data types
	        ad.add("Kohli");
	        ad.add(678.56f);
	        ad.add('d');
	        ad.add(true);
	        System.out.println(ad);

	        // addFirst, addLast
	        ad.addFirst(9898);
	        ad.addLast(8989);
	        System.out.println(ad);

	        // another ArrayDeque
	        ArrayDeque ad1 = new ArrayDeque();
	        ad1.add("Samantha");
	        ad1.add("Katrina");
	        ad1.add("Aishwarya");
	        System.out.println(ad1);

	        // addAll
	        ad.addAll(ad1);
	        System.out.println(ad);

	        // contains
	        boolean res1 = ad.contains(100);
	        System.out.println(res1);

	        res1 = ad.contains(101);
	        System.out.println(res1);

	        res1 = ad.containsAll(ad1);
	        System.out.println(res1);

	        // size
	        int size = ad.size();
	        System.out.println(size);

	        // getClass
	        System.out.println(ad.getClass());

	        // getFirst, getLast
	        System.out.println(ad.getFirst());
	        System.out.println(ad.getLast());

	        // hashCode
	        int hashCode = ad.hashCode();
	        System.out.println(hashCode);

	        // isEmpty
	        boolean empty = ad.isEmpty();
	        System.out.println(empty);

	        // clear ad1
	        ad1.clear();
	        empty = ad1.isEmpty();
	        System.out.println(empty);

	        // remove by index not supported → removeFirst/removeLast
	        Object removed = ad.removeFirst();
	        System.out.println("Removed first: " + removed);
	        System.out.println(ad);

	        removed = ad.removeLast();
	        System.out.println("Removed last: " + removed);
	        System.out.println(ad);

	        // remove by object
	        boolean rem = ad.remove(2222);
	        System.out.println(rem);
	        System.out.println(ad);

	        // removeAll
	        boolean removeAll = ad.removeAll(ad1);
	        System.out.println(removeAll);
	        System.out.println(ad);

	        // pollFirst, pollLast
	        System.out.println("PollFirst: " + ad.pollFirst());
	        System.out.println("PollLast: " + ad.pollLast());
	        System.out.println(ad);

	        // clear everything
	        ad.clear();
	        System.out.println("After clear: " + ad);
	    }
	}


