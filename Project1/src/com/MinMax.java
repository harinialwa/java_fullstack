package com;

public class MinMax {
	public static void main(String[] args) {
        int[] arr = {25, 10, 40, 35, 5};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
