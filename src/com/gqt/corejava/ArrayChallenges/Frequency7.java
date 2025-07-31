package com.gqt.corejava.ArrayChallenges;
import java.util.*;
public class Frequency7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> freq = new HashMap<>();
        System.out.print("Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	}

}
