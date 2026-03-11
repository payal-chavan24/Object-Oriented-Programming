package com.staticwayarray;

public class StaticWayArray {
	public static void main(String[] args) {
		// static way
		// for integer
		int[] arr1 = { 1034, 20567, 30678, 40234 };
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");

		}
		System.out.println();
		// for String
		String[] arr2 = { "java", "is", "powerful" };
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.print(arr2[i] + " ");

		}
		// for byte
		byte[] arr3 = { 14, 24, 35, 4, 4 };
		for (int i = 0; i <= arr3.length - 1; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		// for short
		short[] arr4 = { 32, 78, 89, 90, 84 };
		for (int i = 0; i <= arr4.length - 1; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		// float
		float[] arr5 = { 34.08f, 90.98f, 89.9f };
		for (int i = 0; i <= arr5.length - 1; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		// double
		double[] arr6 = { 89.987, 345.89 };
		for (int i = 0; i <= arr6.length - 1; i++) {
			System.out.print(arr6[i] + " ");
		}
		System.out.println();
		// long
		long[] arr7 = { 7893658l, 7835786l };
		for (int i = 0; i <= arr7.length - 1; i++) {
			System.out.print(arr7[i] + " ");
		}
		System.out.println();
		// boolean
		boolean[] arr8 = { true, true, false, false };
		for (int i = 0; i <= arr8.length - 1; i++) {
			System.out.print(arr8[i] + " ");
		}
		System.out.println();
	}

}
