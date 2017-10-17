package Pkg2;

public class Arre {
	int[] a = new int[3];
	//Book a = new Book("Swapan", "Unix");
	//static
	//{
	
//	Book b1 = new Book("Swapan1", "Unix");
//	Book b2 = new Book("Swapan2", "Unix");
//	Book b3 = new Book("Swapan3", "Unix");
//	Book[] booklist = {b1,b2,b3};
	Book[] booklist = new Book [3];
	//}	
//public static void main (String [] args) {
public void assign() {
	a[1]=4;
	booklist[0]= new Book("Swapan1", "Unix");
	booklist[1] = new Book("Swapan2", "Unix");
	booklist[2] = new Book("Swapan3", "Unix");
	Book a = new Book("Swapan", "Unix");
		String b = a.getClass().getName();
	Class <Book> e = Book.class;
	try {
		Class.forName("Pkg2.Book1");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println(b);
	String c = Book.class.getName(); 
	System.out.println(c);
	System.out.println(e.getName());
	String x=booklist[2].Title;
	String y=booklist[2].Author;
	System.out.println(Book.class.getName());
	System.out.println(x);
	System.out.println(y);
	
	
}
}
