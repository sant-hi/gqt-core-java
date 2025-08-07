package com.gqt.corejava.Strings;

public class BuiltInMethodsUsingStringBuffer {

	public static void main(String[] args) {
		        StringBuffer sb = new StringBuffer("SachinRameshTendulker");

		        // 1. length()
		        int len = sb.length();
		        System.out.println(len); 
		        // Total length of the string buffer.

		        // 2. charAt()
		        char c = sb.charAt(0);
		        System.out.println(c);
		        // Character at index 0.

		        // 3. append() instead of concat()
		        sb.append(" is the best batsman in the world");
		        System.out.println(sb);
		        // Appends to the buffer (like concat in String)

		        // 4. contains() not available directly for StringBuffer, so convert to string
		        boolean res1 = sb.toString().contains("Ramesh");
		        System.out.println(res1);
		        // Checks if substring is present.

		        // 5. endsWith() — also needs conversion to string
		        boolean res2 = sb.toString().endsWith("Tendulker");
		        System.out.println(res2);
		        // Checks if ends with the substring.

		        // 6. startsWith()
		        boolean res3 = sb.toString().startsWith("Sachin");
		        System.out.println(res3);

		        // 7. getClass()
		        Class<?> class1 = sb.getClass();
		        System.out.println(class1);
		        // Returns class type.

		        // 8. hashCode()
		        int hc = sb.hashCode();
		        System.out.println(hc);
		        // Returns hash code of the buffer object.

		        // 9. indexOf() — StringBuffer does not have indexOf for char directly
		        int i = sb.toString().indexOf('e');
		        System.out.println(i);

		        // 10. isBlank() — not available in StringBuffer, convert to string
		        StringBuffer sb2 = new StringBuffer("          ");
		        System.out.println(sb.toString().isBlank());  // false
		        System.out.println(sb2.toString().isBlank()); // true
		        StringBuffer sb3 = new StringBuffer("");
		        System.out.println(sb3.toString().isBlank()); // true

		        // 11. isEmpty()
		        System.out.println(sb.toString().isEmpty());  // false
		        System.out.println(sb3.toString().isEmpty()); // true

		        // 12. Traverse and print each character
		        System.out.println("Traversing StringBuffer:");
		        for (int j = 0; j < sb.length(); j++) {
		            System.out.print(sb.charAt(j) + " ");
		        }
	}

}
