package RelatedObjects;

public class BorrowedItem
{
    private String user_id;
    private String book_id;
    private String borrow_date;
    private String borrow_state;
    private int id;

    // This constructor is used for creating a BorrowedItem with data in database
    public BorrowedItem(String user_id, String book_id, String borrow_date, String borrow_state, int id)
    {
        this.user_id = user_id;
        this.book_id = book_id;
        this.borrow_date = borrow_date;
        this.borrow_state = borrow_state;
        this.id = id;
    }

    //This constructor is used for create a record when borrwing a book, so the default state is "Available"
    public BorrowedItem(String user_id, String book_id, String borrow_date, int id)
    {
        this.user_id = user_id;
        this.book_id = book_id;
        this.borrow_date = borrow_date;
        this.id = id;
        borrow_state = "Normal";
    }

    /**
     * The getter and setters of attributes
     */
    public String getUser_id()
    {
        return user_id;
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getBook_id()
    {
        return book_id;
    }

    public void setBook_id(String book_id)
    {
        this.book_id = book_id;
    }

    public String getBorrow_date()
    {
        return borrow_date;
    }

    public void setBorrow_date(String borrow_date)
    {
        this.borrow_date = borrow_date;
    }

    public String getBorrow_state()
    {
        return borrow_state;
    }

    public void setBorrow_state(String borrow_state)
    {
        this.borrow_state = borrow_state;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
