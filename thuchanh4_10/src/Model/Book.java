package Model;

public class Book {
	public  String bookId;
	public String author;
	public String name;
	public double price;
	public String edition;
	public String dateOfPurchase;
	public String rackNo;
	public Book(String bookId, String author, String name, double price) {
		this.bookId = bookId;
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	public Book(String bookId, String author, String name, double price, String edition, String dateOfPurchase,
			String rackNo) {
		this.bookId = bookId;
		this.author = author;
		this.name = name;
		this.price = price;
		this.edition = edition;
		this.dateOfPurchase = dateOfPurchase;
		this.rackNo = rackNo;
	}
	 public String getBookId() {
	        return bookId;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getEdition() {
	        return edition;
	    }

	    public String getDateOfPurchase() {
	        return dateOfPurchase;
	    }

	    public String getRackNo() {
	        return rackNo;
	    }

	    public void setAuthor(String author) {
	        if (author != null && !author.isEmpty()) {
	            this.author = author;
	        }
	    }

	    public void setName(String name) {
	        if (name != null && !name.isEmpty()) {
	            this.name = name;
	        }
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        }
	    }

	    public void setEdition(String edition) {
	        if (edition != null && !edition.isEmpty()) {
	            this.edition = edition;
	        }
	    }

	    public void setDateOfPurchase(String dateOfPurchase) {
	        if (dateOfPurchase != null && !dateOfPurchase.isEmpty()) {
	            this.dateOfPurchase = dateOfPurchase;
	        }
	    }

	    public void setRackNo(String rackNo) {
	        if (rackNo != null && !rackNo.isEmpty()) {
	            this.rackNo = rackNo;
	        }
	    }

	public void displayBookDetails() {
		System.out.println("Book [bookId=" + bookId + ", author=" + author + ", name=" + name + ", price=" + price + ", edition="
				+ edition + ", dateOfPurchase=" + dateOfPurchase + ", rackNo=" + rackNo + "]");
	}
	public void updateStatus(Book book2) {
		if (book2 != null) {
	        this.author = book2.getAuthor();
	        this.name = book2.getName();
	        this.price = book2.getPrice();
	        this.edition = book2.getEdition();
	        this.dateOfPurchase = book2.getDateOfPurchase();
	        this.rackNo = book2.getRackNo();
	    }
	}
}
