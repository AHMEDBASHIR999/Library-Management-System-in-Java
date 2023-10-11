
// Implement this class with these private members
// id, ISBN, title, author, purchaseDate, MemberID
public class Book {
	
	
	private int id;
	private String ISBN;
	private String title;
	private String author;
	private String purchaseDate;
	private int MemberId;
	public Book(int id, String iSBN, String title, String author, String purchaseDate, int memberId) {
		super();
		this.id = id;
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.purchaseDate = purchaseDate;
		MemberId = memberId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", purchaseDate="
				+ purchaseDate + ", MemberId=" + MemberId + "]";
	}
	
	
	


}
