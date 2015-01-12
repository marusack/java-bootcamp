public class TestBook {

	public static void main(String[] args) {
		Author anAuthor = new Author("pedrito", "pedrito@elautor.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);

		Book anotherBook = new Book("more Java for dummy", new Author("juansito", "juansito@elautor.com", 'm'), 29.95, 888);

		System.out.println("nombre del autor: " + aBook.getAuthor().getName() + " email: " + aBook.getAuthor().getEmail());

		System.out.println("author's email  " + aBook.getAuthorEmail());
		System.out.println("author's gender  " + aBook.getAuthorGender());
		System.out.println("author's name  " + aBook.getAuthorName());
	}

}
