package com;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("example.txt");
			writer.write("Hello, Harini!\nThis is a file handling example in Java.");
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
