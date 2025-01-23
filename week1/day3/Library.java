package week1.day3;

public class Library {
	public String addBook(String bookTitle) {
		return bookTitle;		
	}
	
	public void issueBook() {
		System.out.println("Book issued Successfully");
	}

	public static void main(String[] args) {
		Library b = new Library();		
		System.out.println(b.addBook("The Lost One") + " Book added successfully");
		b.issueBook();

	}

}
