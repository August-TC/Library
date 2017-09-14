package Servlet;

import Database.*;
import RelatedObjects.Reader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "Servlet")
public class DatabaseTestServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body align=\"center\">");
        out.println("<h1>Information</h1>");

        Database database = Database.accessDatabase();
        try
        {
            database.startConnection();
            out.println("<table>");
            DBData dbData = DBData.getInstance();
            ArrayList<Reader> readers = dbData.getReaders(database.getConnection());
            for (Reader reader :
                    readers)
            {
                out.println("<tr>");
                out.println("<td>" + reader.getReader_id() + "</td>");
                out.println("<td>" + reader.getReader_name() + "</td>");
                out.println("<td>" + reader.getReader_type() + "</td>");
                out.println("<td>" + reader.getReader_password()+ "</td>");
                out.println("<td>" + reader.getReader_state() + "</td>");
                out.println("<td>" + reader.getReader_email() + "</td>");
                out.println("<td>" + reader.getReader_TEL() + "</td>");
                out.println("<td>" + reader.getReader_fine() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            database.closeConnection();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        out.println("</body>");
        out.println("</html>");

    }
}
