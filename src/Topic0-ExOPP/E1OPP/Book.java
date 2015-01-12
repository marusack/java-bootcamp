public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price) {
		this.setName(name);
		this.setAuthor(author);
		this.setPrice(price);
		this.setQtyInStock(0);
	}

	public Book(String name, Author author, double price, int qtyInStock) {
		this.setName(name);
		this.setAuthor(author);
		this.setPrice(price);
		this.setQtyInStock(qtyInStock);
	}

	public String toString() {
		return (this.getName() + " by " + this.getAuthor().toString());
	}

	// Introduce new methods called getAuthorName(), getAuthorEmail(),
	// getAuthorGender() in the Book class to return the name, email and gender
	// of the author of the book.
	public String getAuthorName() {
		return (this.getAuthor().getName());
	}

	public String getAuthorEmail() {
		return (this.getAuthor().getEmail());
	}

	public char getAuthorGender() {
		return (this.getAuthor().getGender());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

}
