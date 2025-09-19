package com.gqt.corejava.collection;
import java.util.ArrayList;
public class ArrayListCode1 {
		public static void main(String[] args) {
			ArrayList al = new ArrayList();
			//insertimg the data
			al.add(100);
			al.add(50);
			al.add(150);
			al.add(25);
			al.add(125);
			al.add(75);
			al.add(175);
			System.out.println(al);
			al.add("Kohli");
			al.add(678.56f);
			al.add('d');
			al.add(true);
			System.out.println(al);
			al.add(2,1111);
			System.out.println(al);
			al.set(2, 2222);
			System.out.println(al);
			al.addFirst(9898);
			al.addLast(8989);
			System.out.println(al);
			ArrayList al1 = new ArrayList();
			al1.add("Samantha");
			al1.add("Katrina");
			al1.add("Aiswarya");
			System.out.println(al1);
			al.add(al1);
			//al.add(al1);
			al.addAll(al1);
			System.out.println(al);
			al.addAll(3,al1);
			System.out.println(al);
			
			/// ------------
			//al.clear();
			///System.out.println(al);
	        ArrayList al_clone = (ArrayList)al.clone();
			System.out.println(al_clone);
			
			boolean res1 = al.contains(100);
			System.out.println(res1);
	        
			res1 = al.contains(101);
			System.out.println(res1);
			
			res1 = al.containsAll(al1);
			System.out.println(res1);

	        //Object object = al.get(500);
			//System.out.println(object);

			int size = al.size();
			System.out.println(size);
			
			System.out.println(al.getClass());
			System.out.println(al.getFirst());
			System.out.println(al.getLast());
			
			int hashCode = al.hashCode();
			System.out.println(hashCode);
			
			int indexOf = al.lastIndexOf("Aishwarya");
			System.out.println(indexOf);
			
			int lastIndexOf = al.lastIndexOf("Aishwarya");
			System.out.println(lastIndexOf);
			
			boolean empty = al.isEmpty();
			System.out.println(indexOf);
			
			al1.clear();
			empty = al1.isEmpty();
			System.out.println(empty);
			
			Object remove = al.remove(0);
			System.out.println(remove);
			System.out.println(al);
			
			Object rm = 2222;
			remove = al.remove(rm);
			System.out.println(remove);
			System.out.println(al);
			
			boolean removeAll = al.removeAll(al1);
			System.out.println(removeAll);
			System.out.println(al);
			
			al.removeFirst();
			al.removeLast();
			
			System.out.println(al);
		}
	}


