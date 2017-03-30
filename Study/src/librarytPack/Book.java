package librarytPack;

public class Book {
	private String bookName;
	private int yearCreate;
	private int pagesQuantity;
	public Book(String bookName, int yearCreate, int pagesQuantity) {
		super();
		this.bookName = bookName;
		this.yearCreate = yearCreate;
		this.pagesQuantity = pagesQuantity;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getYearCreate() {
		return yearCreate;
	}
	public void setYearCreate(int yearCreate) {
		this.yearCreate = yearCreate;
	}
	public int getPagesQuantity() {
		return pagesQuantity;
	}
	public void setPagesQuantity(int pagesQuantity) {
		this.pagesQuantity = pagesQuantity;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", yearCreate=" + yearCreate + ", pagesQuantity=" + pagesQuantity + "]";
	}
	
	

}
