package q3;
/**
 * The class which contains the parameters of a Book object.
 * @author Cameron
 * @version 1.0
 */
public class Book {
    /**
     * The title of the book object.
     */
    private String title;
    /**
     * The author of the book object.
     */
    private String author;
    /**
     * The publisher of the book object.
     */
    private String publisher;
    /**
     * The copyright date of the book object.
     */
    private String copyright;
    /**
     * <p>The constructor for the Book object which accepts 
     * arguments.</p>
     * @param name The title.
     * @param writer The author.
     * @param pub The publisher.
     * @param copy The copyright date.
     */
    public Book(String name, String writer, String pub, String copy) {
        title = name;
        author = writer;
        publisher = pub;
        copyright = copy;
    }
    /**
     * <p>The constructor for the Book object, which accepts no arguments
     * but contains the title, author, publisher and copyright date for 
     * the book object.</p>
     */
    public Book() {
        title = "";
        author = "";
        publisher = "";
        copyright = "";
    }    
    /**
     * Sets the title of the book.
     * @param name the title of the book.
     */
    public void setTitle(String name) {        
        title = name;
    }    
    /**
     * Sets the author of the book.
     * @param writer the author of the book.
     */
    public void setAuthor(String writer) {        
        author = writer;
    }
    /**
     * Sets the publisher of the book.
     * @param pub the publisher of the book.
     */
    public void setPublisher(String pub) {        
        publisher = pub;
    }    
    /**
     * Sets the copyright date of the book.
     * @param copy the copyright date of the book.
     */
    public void setCopyright(String copy) {        
        copyright = copy;
    } 
    /**
     * Gets the title of the book.
     * @return the title.
     */
    public String getTitle() {
        
        return title;
    }
    /**
     * Gets the author of the book.
     * @return the author.
     */
    public String getAuthor() {
        
        return author;
    }
    /**
     * Gets the publisher of the book.
     * @return the publisher.
     */
    public String getPublisher() {
        
        return publisher;
    }
    /**
     * Gets the copyright date of the book.
     * @return the copyright date.
     */
    public String getCopyright() {
        
        return copyright;
    }
    /**
     * <p>Outputs a formatted string with the title, author
     * publisher and copyright date for the book object.</p>
     * @return the string with the parameters of the book.
     */
    public String toString() {
       
        return "Title: " + title + "\nAuthor: " + author
                + "\nPublisher: " + publisher 
                + "\nCopyright Date: " + copyright;
    }  
}
