package com.gqt.corejava.collection;
import java.util.PriorityQueue;
public class PriorityQueueCode1 {
	    public static void main(String[] args) {
	        PriorityQueue pq = new PriorityQueue();

	        // inserting the data
	        pq.add(100);
	        pq.add(50);
	        pq.add(150);
	        pq.add(25);
	        pq.add(125);
	        pq.add(75);
	        pq.add(175);
	        System.out.println(pq);

	        // peek (head element - smallest in natural order)
	        System.out.println(pq.peek());

	        // offer (same as add)
	        pq.offer(200);
	        System.out.println(pq);

	        // remove head element
	        Object removedHead = pq.remove();
	        System.out.println("Removed head: " + removedHead);
	        System.out.println(pq);

	        // poll (removes and returns head)
	        Object polled = pq.poll();
	        System.out.println("Polled: " + polled);
	        System.out.println(pq);

	        // contains
	        boolean res1 = pq.contains(100);
	        System.out.println(res1);

	        res1 = pq.contains(101);
	        System.out.println(res1);

	        // size
	        int size = pq.size();
	        System.out.println(size);

	        // class info
	        System.out.println(pq.getClass());

	        // hashCode
	        int hashCode = pq.hashCode();
	        System.out.println(hashCode);

	        // another priority queue
	        PriorityQueue pq1 = new PriorityQueue();
	        pq1.add(300);
	        pq1.add(400);
	        pq1.add(500);
	        System.out.println(pq1);

	        // addAll
	        pq.addAll(pq1);
	        System.out.println(pq);

	        // containsAll
	        boolean res2 = pq.containsAll(pq1);
	        System.out.println(res2);

	        // remove specific element
	        boolean removed = pq.remove(125);
	        System.out.println(removed);
	        System.out.println(pq);

	        // removeAll
	        boolean removeAll = pq.removeAll(pq1);
	        System.out.println(removeAll);
	        System.out.println(pq);

	        // clear
	        pq.clear();
	        System.out.println(pq);

	        // isEmpty
	        boolean empty = pq.isEmpty();
	        System.out.println(empty);
	    }
	}
