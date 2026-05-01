import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;



public class FeedbackServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException
    {
        request.setAttribute("name", request.getParameter("name"));
        request.setAttribute("email", request.getParameter("email"));
        request.setAttribute("course", request.getParameter("course"));
        request.setAttribute("rating", request.getParameter("rating"));

        RequestDispatcher rd =
        request.getRequestDispatcher("feedback.jsp");

        rd.forward(request, response);
    }
}
