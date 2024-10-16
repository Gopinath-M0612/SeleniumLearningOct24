package learning.week1day2;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library bookTitle = new Library();
		String title = bookTitle.addBook("Run for life");
		System.out.println("Book title is "+title);
		bookTitle.issueBook();

	}

}
