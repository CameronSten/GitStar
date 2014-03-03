package q3;

import java.util.Scanner;
/**
 * <p>The class which creates a digital bookshelf, containing
 * four book objects complete with title, author, publisher
 * and copyright date.</p>
 * @author Cameron
 * @version 1.0
 */
public class Bookshelf {
    /**
     * <p>This is the main method which creates the book objects
     * asking for the users input for the final one..</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // title of the users book.
        String title1;
        //author of the users book.
        String author1;
        //publisher of the users book.
        String pub1;
        //copyright date of the users book.
        String copy1;
        //four book objects, 3 predefined, 1 user defined.
        Book book1 = new Book();        
        Book book2 = new Book("Lord of the Rings", "JRR Tolkien",
                "Glen Allen & Unwin", "1954");
        Book book3 = new Book("Harry Potter", "JK Rowling", 
                "Bloomsbury Publishing", "1997");
        Book book4 = new Book("My Book", "Cameron Stenmark", 
                "Cameron Publishing", "2013");
        
        System.out.println("Booklist incomplete.");
        System.out.println("Please enter the title of the missing book: "); 
        title1 = scan.nextLine();
        
        System.out.println("Please enter the Author of the book: ");
        author1 = scan.nextLine();
        
        System.out.println("Please enter the publisher of the book: ");
        pub1 = scan.nextLine();
        
        System.out.println("Please enter the copyright date of the book: ");
        copy1 = scan.nextLine();
        
        scan.close();
        
        book1.setTitle(title1);
        book1.setAuthor(author1);
        book1.setPublisher(pub1);
        book1.setCopyright(copy1);
        
        System.out.println("Book list complete. Outputting results: \n"
                + book1.toString() + "\n\nTitle: " 
                + book2.getTitle() + "\nAuthor: " + book2.getAuthor() 
                + "\nPublisher: " + book2.getPublisher() 
                + "\nCopyright Date: " + book2.getCopyright()
                + "\n\n" + book3.toString() + "\n\n" + book4.toString());
        
        

        
        System.out.println("\nQuestion three was called and ran sucessfully.");
    }
}
