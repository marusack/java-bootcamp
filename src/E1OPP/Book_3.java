public class Book_3 {

	private String name;
	private double price;
	private Author[] authors = new Author[5];
	private int numAuthors = 0;
	private int qtyInStock = 0;

	public Book_3(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Book_3(String name, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public Author[] getAuthors() {
		return this.authors;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return this.qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public void printAuthors() {
		int authorNo = 0;
		for (Author a : this.authors) {
			if (a == null) {
				continue;
			}
			System.out.println("(" + (++authorNo) + ") " + a);
		}
	}

	public void addAuthor(Author author) {
		for (int i = 0; i < authors.length; i++) {
			if (authors[i] != null) {
				continue;
			}

			authors[i] = author;
			++numAuthors;
			break;
		}
	}

	public boolean removeAuthorByName(String authorName) {
		for (int i = 0; i < authors.length; i++) {
			if (authors[i] == null) {
				continue;
			}

			if (!authorName.toUpperCase().equals(authors[i].getName().toUpperCase())) {
				continue;
			}

			authors[i] = null;
			--numAuthors;
			return true;
		}

		return false;
	}

	public String toString() {
		return "'" + name + "' by " + numAuthors + " authors";
	}
}