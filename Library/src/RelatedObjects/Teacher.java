package RelatedObjects;

public class Teacher extends Reader
{
    // [R1-21] As an teacher I borrow that the maximum number of the book is 20
    private int maxBorrowNum;

    public Teacher(String reader_id, String reader_name, String reader_password, String reader_state, String reader_email, String reader_TEL, int reader_fine)
    {
        super(reader_id, reader_name, "Teacher", reader_password, reader_state, reader_email, reader_TEL, reader_fine);
        maxBorrowNum = 20;
    }

    public int getMaxBorrowNum()
    {
        return maxBorrowNum;
    }
}
