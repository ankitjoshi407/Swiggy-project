/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.loginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ankit
 */
public class login extends HttpServlet {

   
   
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String m_no=request.getParameter("mno");
        String pwd_get=request.getParameter("pwd");
        loginDAO ld=new loginDAO();
        if(ld.searchuser(m_no,pwd_get))
        {
            HttpSession session=request.getSession();
            session.setAttribute("name",ld.getName());
            session.setAttribute("mno", m_no);
            session.setAttribute("pwd", pwd_get);
            response.sendRedirect("websiteclone.jsp");
        }
        else
        {
         out.println("<script type=\"text/javascript\">");
         out.println("alert('Mobile number or Password Incorrect');");
         out.println("location='login.jsp';");
         out.println("</script>");
        }
        
        
    }

}
