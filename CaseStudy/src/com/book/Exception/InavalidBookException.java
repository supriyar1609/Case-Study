package com.book.Exception;

public class InavalidBookException extends Exception{
	public static void main(String args[]) {
		try {
			throw new InavalidBookException();
		}
		catch(InavalidBookException ex) {
			System.out.println("Caught an Exception");
			System.out.println(ex.getMessage());
		}
	}
}
