package com.gqt.corejava.collection;
import java.util.HashSet;
public class HashSetCode1 {
	    public static void main(String[] args) {
	        HashSet hs = new HashSet();

	        // inserting data
	        hs.add(100);
	        hs.add(50);
	        hs.add(150);
	        hs.add(25);
	        hs.add(125);
	        hs.add(75);
	        hs.add(175);
	        System.out.println(hs);

	        // add different types of data (allowed, but not recommended in practice)
	        hs.add("Kohli");
	        hs.add(678.56f);
	        hs.add('d');
	        hs.add(true);
	        System.out.println(hs);

	        // create another HashSet
	        HashSet hs1 = new HashSet();
	        hs1.add("Samantha");
	        hs1.add("Katrina");
	        hs1.add("Aishwarya");
	        System.out.println(hs1);

	        // add nested set (HashSet allows any Object)
	        hs.add(hs1);
	        System.out.println(hs);

	        // addAll
	        hs.addAll(hs1);
	        System.out.println(hs);

	        // clone
	        HashSet hs_clone = (HashSet) hs.clone();
	        System.out.println(hs_clone);

	        // contains
	        boolean res1 = hs.contains(100);
	        System.out.println(res1);

	        res1 = hs.contains(101);
	        System.out.println(res1);

	        res1 = hs.containsAll(hs1);
	        System.out.println(res1);

	        // size
	        int size = hs.size();
	        System.out.println(size);

	        // class info
	        System.out.println(hs.getClass());

	        // hashCode
	        int hashCode = hs.hashCode();
	        System.out.println(hashCode);

	        // isEmpty
	        boolean empty = hs.isEmpty();
	        System.out.println(empty);

	        // clear hs1
	        hs1.clear();
	        empty = hs1.isEmpty();
	        System.out.println(empty);

	        // remove by element
	        Object removed = hs.remove(100);
	        System.out.println(removed);
	        System.out.println(hs);

	        // remove by object
	        Object rm = 2222;
	        boolean removeObj = hs.remove(rm);
	        System.out.println(removeObj);
	        System.out.println(hs);

	        // removeAll
	        boolean removeAll = hs.removeAll(hs1);
	        System.out.println(removeAll);
	        System.out.println(hs);

	        // clear all
	        hs.clear();
	        System.out.println(hs);
	        System.out.println(hs.isEmpty());
	    }
}
