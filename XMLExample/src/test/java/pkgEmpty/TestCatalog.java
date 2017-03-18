package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgLibrary.Book;
import pkgLibrary.BookException;
import pkgLibrary.Catalog;

public class TestCatalog {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testAddBook() throws BookException {
		Catalog cat= ReadXMLFile();
		Book book =new Book("bk001");
		Catalog.AddBook(0,book);
	}

	private Catalog ReadXMLFile() {
		
		return null;
	}
	
	@Test (expected = BookException.class)
	public void testGetBook() throws BookException {
		Catalog cat= ReadXMLFile();
		cat.GetBook(cat, "bk001");
	}
}
