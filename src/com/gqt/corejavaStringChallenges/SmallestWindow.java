package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class SmallestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter pattern: ");
        String pat = sc.nextLine();

        final int no_of_chars = 256;
        int[] patFreq = new int[no_of_chars];
        int[] strFreq = new int[no_of_chars];

        for (char c : pat.toCharArray())
            patFreq[c]++;

        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE;
        int count = 0;

        for (int end = 0; end < str.length(); end++) {
            strFreq[str.charAt(end)]++;

            if (patFreq[str.charAt(end)] != 0 && strFreq[str.charAt(end)] <= patFreq[str.charAt(end)])
                count++;

            if (count == pat.length()) {
                while (strFreq[str.charAt(start)] > patFreq[str.charAt(start)] || patFreq[str.charAt(start)] == 0) {
                    if (strFreq[str.charAt(start)] > patFreq[str.charAt(start)])
                        strFreq[str.charAt(start)]--;
                    start++;
                }

                int len = end - start + 1;
                if (minLen > len) {
                    minLen = len;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1)
            System.out.println("No such window exists.");
        else
            System.out.println("Smallest window: " + str.substring(startIndex, startIndex + minLen));
	}

}
