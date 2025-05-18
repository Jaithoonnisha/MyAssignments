package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lm=new Library();
		System.out.println("The output from Library Management");
		String op=lm.addBook("Fault in our stars");
		System.out.println(op);
		lm.issueBook();
	}

}
