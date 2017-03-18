package pkgLibrary;

@SuppressWarnings("serial")
public class BookException extends Exception{

	private Book book;
	
	public BookException(Book book){
		this.book=book;
	}
	
	public BookException() {
		super();
	}

	public Book getBook(){
		return book;
	}
}
