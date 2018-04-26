import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("username");
        String pass =  request.getParameter("password");String message = "";

        if("admin".equals(uname) && "admin".equals(pass)){
            request.setAttribute("user",uname);
            RequestDispatcher re = request.getRequestDispatcher("/index.jsp");
            re.forward(request,response);
        }else{
            RequestDispatcher re = request.getRequestDispatcher("/login.jsp");
            re.forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
