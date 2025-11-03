package com;
public class CommandLine {
	
	public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println(args[0] + " Edutech " + args[1]);
        } else {
            System.out.println("Enter Inputs");
        }
    }
}
