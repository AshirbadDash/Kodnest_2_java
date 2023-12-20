package com.kodnest.composition;

class Page {
	String content;

	public Page(String content) {
		this.content = content;

	}

	void displayContent() {
		System.out.println(content);

	}
}

class Book {
	Page Page;
//	String Content;

//	public Book(Page page) {
//		this.Page = new Page();
//
//	}

	public Book(String Content) {
		this.Page = new Page(Content);

	}

	void readPage() {
		System.out.println("The pages are");
//		Page.displayContent();
	}

}

public class CompositionDemo {
	public static void main(String[] args) {
		Book b = new Book("Reading the content of page.......");
		b.readPage();
		b = null; // book is going to be null so no object is being created (constructor call of
		// book is not going to happen)and no page is not being
//created as page object creation is inside of constructor of book since constructor is not called 
		// no page is created as no page is thererbook is also not there.
		b.readPage();
	}
}
