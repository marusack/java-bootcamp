
public class Book_2 {

	   
	   private String   name;
	   private double   price;
	private Author[] authors;
	   private int      qtyInStock = 0;

	   public Book_2(String name, Author[] authors, double price) {
	      this.name    = name;
	      this.authors = authors;
	      this.price   = price;
	   }

	   public Book_2(String name, Author[] authors, double price, int qtyInStock) {
	      this.name       = name;
	      this.authors    = authors;
	      this.price      = price;
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
	         System.out.println("("+(++authorNo)+") "+a);
	      }
	   }

	   public String toString() {
	      return "'" + name +"' by " + authors.length + " authors";
	   }   
	}