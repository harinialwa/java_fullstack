package com;
import java.util.*;
public class SortingArray {
	   public static void main(String[] args) {
	        int[] arr = {5, 3, 8, 1, 9};

	        Arrays.sort(arr);

	        System.out.println("Sorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

}
