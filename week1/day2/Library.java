package week1.day2;

public class Library {
	
	public String addBook(String BookTitle)
	{
		
		return "The book " + BookTitle + " Added Successfully";
		
	}
	
	 void issueBook()
	{
		System.out.println("Book issued Successfully");
	}
	
	
	

	public static void main(String[] args) {
		Library lb= new Library();
		System.out.println("Output from Library class");
		String data=lb.addBook("It takes two");
		System.out.println(data);
		lb.issueBook();
	}

}
