package com.book;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Book Name");
		String bookname=sc.nextLine();
		
		System.out.println("Enter the Book Price");
		int price=sc.nextInt();
		
		Book bk=new Book();
		bk.setBookName(bookname);
		bk.setPrice(price);
		
		System.out.println("Book Details");
		System.out.println("Book Name: "+bk.getBookName());
		System.out.println("Book Price= "+bk.getPrice());
	}
}
