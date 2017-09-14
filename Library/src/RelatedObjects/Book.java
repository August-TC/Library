package RelatedObjects;

public class Book
{
    private String book_id;
    private String book_name;
    private String book_author;
    //private String book_img;
    private String book_introduction;
    private String book_location;
    //private String book_price;
    private String book_publish;
    private String book_state;

    // This constructor is used for creating a book with data in database
    public Book(String book_id, String book_name, String book_author, String book_introduction, String book_location, String book_publish, String book_state)
    {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_introduction = book_introduction;
        this.book_location = book_location;
        this.book_publish = book_publish;
        this.book_state = book_state;
    }

    //This constructor is used for librarian to add books, so the default state is "Available"
    public Book(String book_id, String book_name, String book_author, String book_introduction, String book_location, String book_publish)
    {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_introduction = book_introduction;
        this.book_location = book_location;
        this.book_publish = book_publish;
        book_state = "Available";
    }

    /**
     * The getter and setters of attributes
     */
    public String getBook_id()
    {
        return book_id;
    }

    public void setBook_id(String book_id)
    {
        this.book_id = book_id;
    }

    public String getBook_name()
    {
        return book_name;
    }

    public void setBook_name(String book_name)
    {
        this.book_name = book_name;
    }

    public String getBook_author()
    {
        return book_author;
    }

    public void setBook_author(String book_author)
    {
        this.book_author = book_author;
    }

    public String getBook_introduction()
    {
        return book_introduction;
    }

    public void setBook_introduction(String book_introduction)
    {
        this.book_introduction = book_introduction;
    }

    public String getBook_location()
    {
        return book_location;
    }

    public void setBook_location(String book_location)
    {
        this.book_location = book_location;
    }

    public String getBook_publish()
    {
        return book_publish;
    }

    public void setBook_publish(String book_publish)
    {
        this.book_publish = book_publish;
    }

    public String getBook_state()
    {
        return book_state;
    }

    public void setBook_state(String book_state)
    {
        this.book_state = book_state;
    }
}
