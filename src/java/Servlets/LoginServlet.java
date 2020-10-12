package Servlets;

import Domain.AccountService;
import Domain.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession newSession = request.getSession();
        
        if (request.getParameter("logout") != null)
        {
            newSession.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        AccountService as = new AccountService();
        User user = as.login(username, password);
        if (!(username.equals("") || username.equals(null) || password.equals("") || username.equals(null)))
        {
            if(user != null)
            {

                HttpSession session = request.getSession();
                session.setAttribute("homeUsername", username);
                getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            }
            else 
            {
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
        }
        else 
        {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

}
