/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Modal.login;
import Modal.loginDAO;
/**
 *
 * @author Ankit
 */
public class signup extends HttpServlet {

  
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
         String m_no=request.getParameter("mno");
         String name_of=request.getParameter("nm");
         String email_of=request.getParameter("mail");
         String pwd_get=request.getParameter("pwd");
         login l=new login();
         l.setEmail(email_of);
         l.setM_no(m_no);
         l.setName(name_of);
         l.setPwd_get(pwd_get);
          loginDAO ld=new loginDAO();
           if(ld.saveuser(l))
        {
            out.println("<script type=\"text/javascript\">");
         out.println("alert('Signup Successful');");
         out.println("location='login.jsp';");
         out.println("</script>");
        }
        else
        {
         out.println("<script type=\"text/javascript\">");
         out.println("alert('Signup Failed');");
         out.println("location='signup.jsp';");
         out.println("</script>");
        }
        }
    }

   


