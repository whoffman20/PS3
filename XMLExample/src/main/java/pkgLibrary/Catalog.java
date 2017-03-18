package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	

	public static Book GetBook(Catalog cat, String Bookid) throws BookException{
		
		for (int bookno=0; bookno<cat.getBooks().size(); bookno+=1){
		
			if (cat.getBooks().get(bookno).getId()==Bookid){
			
				return cat.getBooks().get(bookno);
			}
		}
		throw new BookException();
	}
	
	public static Catalog AddBook(int id, Book book) throws BookException{
		Catalog cat = ReadXMLFile();
		
		if(id==cat.getId()){
			
			for (int bookno=0; bookno<cat.getBooks().size(); bookno+=1) {
			
				if (book.getId().equals(cat.getBooks().get(bookno).getId())) {
				
					System.out.println("Book already exists");
					
					throw new BookException(book);
				}
			return cat;	

		}

		cat.getBooks().add(book);

	}
		return cat;
	}


	private static Catalog ReadXMLFile() {
		return null;
	}


	
	
	
	
}
