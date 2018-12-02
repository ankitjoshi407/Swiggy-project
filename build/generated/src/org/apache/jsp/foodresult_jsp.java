package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modal.Hotel;
import javax.servlet.http.HttpSession;;

public final class foodresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Your search results</title>\r\n");
      out.write("<style>\r\n");
      out.write("a {\r\n");
      out.write("color:DarkOrange;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("}\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\t height: 100%; \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#E9967A\">\r\n");
      out.write("<a href=\"website.jsp\">  <img src=\"6.jpg\" style=\"width:200px;height:90px;\"><br></a>\r\n");
      out.write("<center>\r\n");
      out.write("    <br><br><br><br><p><h1 style=\"color:black;\">YOUR SEARCH RESULTS</h1></p>\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");

    HttpSession sess=request.getSession();
    ArrayList<Hotel> l=(ArrayList<Hotel>)sess.getAttribute("hotellist");
    
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("    <table border=\"1\" style=\"border-collapse:collapse;width:50%;height:20%;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            \r\n");
      out.write("            <th>Name</th>\r\n");
      out.write("            <th>Address</th>\r\n");
      out.write("            <th>State</th>\r\n");
      out.write("            <th>Mobile number</th>\r\n");
      out.write("            <th>Photo</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </center>\r\n");
      out.write("        ");

            for(int i=0;i<l.size();i++)
            {
                
            
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(l.get(i).getName());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(l.get(i).getAddress());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(l.get(i).getState());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(l.get(i).getMno());
      out.write("</td>\r\n");
      out.write("                <td><img src=\"download");
      out.print(i);
      out.write(".jpg\" alt=\"\" width=\"40%\" height=\"50%\"></img></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
                
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
