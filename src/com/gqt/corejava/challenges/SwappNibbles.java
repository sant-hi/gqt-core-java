package com.gqt.corejava.challenges;
public class SwappNibbles {
		public static void main(String[] args) {
		byte originalByte = (byte) 0b10101010;
		byte swappedByte = (byte) ((originalByte & 0x0F) << 4 | (originalByte & 0xF0) >> 4);
		System.out.println("Original byte: " + Integer.toBinaryString(originalByte& 0xFF));
		System.out.println("Swapped byte: " + Integer.toBinaryString(swappedByte & 0xFF));
		}
		}

