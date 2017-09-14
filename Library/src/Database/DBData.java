package Database;

import RelatedObjects.Reader;
import RelatedObjects.Student;
import RelatedObjects.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBData
{
    private static DBData ourInstance = new DBData();

    public static DBData getInstance()
    {
        return ourInstance;
    }

    private DBData()
    {
    }

    private ArrayList<Reader> readers = new ArrayList<>();


    public ArrayList<Reader> getReaders(Connection connection) throws SQLException
    {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM reader");
        while (resultSet.next())
        {
            switch (resultSet.getString("reader_type"))
            {
                case "Teacher":
                    Reader teacher = new Teacher(
                            resultSet.getString("reader_id"),
                            resultSet.getString("reader_name"),
                            resultSet.getString("reader_password"),
                            resultSet.getString("reader_state"),
                            resultSet.getString("reader_email"),
                            resultSet.getString("reader_mobile"),
                            resultSet.getInt("reader_fine")
                    );
                    readers.add(teacher);
                    break;
                case "Student":
                    Reader student = new Student(
                            resultSet.getString("reader_id"),
                            resultSet.getString("reader_name"),
                            resultSet.getString("reader_password"),
                            resultSet.getString("reader_state"),
                            resultSet.getString("reader_email"),
                            resultSet.getString("reader_mobile"),
                            resultSet.getInt("reader_fine")
                    );
                    readers.add(student);
                    break;
            }
        }
        resultSet.close();
        statement.close();
        return readers;
    }
}
