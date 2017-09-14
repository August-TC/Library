package RelatedObjects;

public class Student extends Reader
{
    // [R1-20] As an student I borrow that the maximum number of the book is 15
    private int maxBorrowNum;

    public Student(String reader_id, String reader_name, String reader_password, String reader_state, String reader_email, String reader_TEL, int reader_fine)
    {
        super(reader_id, reader_name, "Student", reader_password, reader_state, reader_email, reader_TEL, reader_fine);
        maxBorrowNum = 15;
    }

    public int getMaxBorrowNum()
    {
        return maxBorrowNum;
    }
}
