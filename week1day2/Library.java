package learning.week1day2;

public class Library {
	
	public String addBook(String bookTitle){
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		Library bT = new Library();
		String title = bT.addBook("Wings of Fire");
		System.out.println("Book Title is "+ title);
		bT.issueBook();
		
	}
	
}
