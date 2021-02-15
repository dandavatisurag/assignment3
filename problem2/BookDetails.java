package problem2;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBookNo(1);
		book.setTitle("XYZ");
		book.setAuthor("abc");
		book.setPrice(850);
		System.out.println(book.getBookNo());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		
		
		EngineeringBook engineeringBook =new EngineeringBook();
		engineeringBook.setBookNo(1234);
		engineeringBook.setCategory("EEE");
		engineeringBook.setTitle("POWER SYSTEM");
		engineeringBook.setAuthor("LMN");
		engineeringBook.setPrice(900);
		System.out.println(engineeringBook.getBookNo());
		System.out.println(engineeringBook.getCategory());
		System.out.println(engineeringBook.getTitle());
		System.out.println(engineeringBook.getAuthor());
		System.out.println(engineeringBook.getPrice());
	}

}
	
