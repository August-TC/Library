package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database
{
    //Connection Object : connection, use to Connect to the database;
    private Connection connection;

    //Driver's Name
    private String driver = "com.mysql.jdbc.Driver";

    //the URL of database "result"
    private String url = "jdbc:mysql://39.108.94.59:3306/library?useUnicode=true&characterEncoding=UTF-8";

    //User name of MySQL
    private String user = "reader";

    //User's password
    private String password = "reader";

    //Single instance of database "result"
    private static final Database database = new Database();
    private Database(){};
    public static Database accessDatabase()
    {
        return database;
    }

    //Start the connection to the database "library"
    public void startConnection()
    {
        try
        {
            Class.forName(driver);
            connection = DriverManager.getConnection(
                    url,
                    user,
                    password
            );
            if(!connection.isClosed())
            {
                System.out.println("Succeeded connecting to the Database!");
            }

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //Close the connection to the database
    public void closeConnection() throws SQLException
    {
        connection.close();
    }

    /**
     * The getter and setters of attributes
     */

    public Connection getConnection()
    {
        return connection;
    }

    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }

    public String getDriver()
    {
        return driver;
    }

    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
