package com.gqt.corejava.collection;
import java.util.TreeSet;
public class TreeSetCode1 {
	    public static void main(String[] args) {
	        TreeSet ts = new TreeSet();
	        // inserting the data
	        ts.add(100);
	        ts.add(50);
	        ts.add(150);
	        ts.add(25);
	        ts.add(125);
	        ts.add(75);
	        ts.add(175);
	        System.out.println(ts); // Sorted order

	        // duplicate element (ignored)
	        ts.add(100);
	        System.out.println("After duplicate add: " + ts);

	        // first and last
	        System.out.println("First: " + ts.first());
	        System.out.println("Last: " + ts.last());

	        // higher, lower, ceiling, floor
	        System.out.println("Higher(100): " + ts.higher(100));
	        System.out.println("Lower(100): " + ts.lower(100));
	        System.out.println("Ceiling(110): " + ts.ceiling(110));
	        System.out.println("Floor(110): " + ts.floor(110));

	        // headSet, tailSet, subSet
	        System.out.println("HeadSet(<100): " + ts.headSet(100));
	        System.out.println("TailSet(>=100): " + ts.tailSet(100));
	        System.out.println("SubSet(50-150): " + ts.subSet(50, 150));

	        // contains
	        boolean res1 = ts.contains(100);
	        System.out.println(res1);

	        res1 = ts.contains(101);
	        System.out.println(res1);

	        // size
	        int size = ts.size();
	        System.out.println(size);

	        // class info
	        System.out.println(ts.getClass());

	        // hashCode
	        int hashCode = ts.hashCode();
	        System.out.println(hashCode);

	        // remove by object
	        boolean removed = ts.remove(125);
	        System.out.println("Removed 125? " + removed);
	        System.out.println(ts);

	        // pollFirst, pollLast
	        Object first = ts.pollFirst();
	        System.out.println("PollFirst: " + first);
	        System.out.println(ts);

	        Object last = ts.pollLast();
	        System.out.println("PollLast: " + last);
	        System.out.println(ts);

	        // clone
	        TreeSet ts_clone = (TreeSet) ts.clone();
	        System.out.println("Clone: " + ts_clone);

	        // clear
	        ts.clear();
	        System.out.println("Cleared: " + ts);

	        // isEmpty
	        boolean empty = ts.isEmpty();
	        System.out.println(empty);
	    }
	}


