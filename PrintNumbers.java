package com;

import java.util.stream.IntStream;

public class PrintNumbers {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
	}
}
