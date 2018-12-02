package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Statement;
import Controller.javaconnect;
import java.sql.Connection;
import java.sql.Connection;
import java.io.PrintWriter;
import java.io.PrintWriter;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin-top:10vw;margin-left: 36vw;\">\r\n");
      out.write("      <h1 style=\"margin-left: 5.0vw;font-size: 2.0vw;\">Your Cart</h1>\r\n");
      out.write("           <table cellspacing=\"20vw;\" style=\"\">\r\n");
      out.write("               <tr>\r\n");
      out.write("                   <th>Item Name</th>\r\n");
      out.write("                   <th>Quantity</th>\r\n");
      out.write("                   <th>Price</th>\r\n");
      out.write("               </tr>\r\n");
      out.write("              \r\n");
      out.write("       ");
 
           try{
           PrintWriter pw=response.getWriter();
           double sum=0;
           Connection con=javaconnect.connectDb();
           Statement st=con.createStatement();
           ResultSet rs;
           String[] str;
           str=request.getParameterValues("checkbox");
           for(int i=0;i<str.length;i++){
               System.out.print(str[i]+" ");
           }
           float count=0;
           if(str!=null){
               for(int i=0;i<str.length;i++){
                   //System.out.print(sports[i]+" ");
                   st.executeQuery("select itemname,price from itemlist where id="+str[i]+"");
                   rs=st.getResultSet();
                   while(rs.next()){
                       String nameVal=rs.getString("itemname");
                       //System.out.print(nameVal);
                       int c=rs.getInt("price");
           
               sum+=c;
               System.out.print(sum);
               int q=1;
               count++;
      out.write("\r\n");
      out.write("               <tr><td>");
      out.print( rs.getString("itemname"));
      out.write("</td>\r\n");
      out.write("                   <td>");
      out.print(q);
      out.write("</td>\r\n");
      out.write("                   <td>");
      out.print( rs.getInt("price"));
      out.write("</td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               ");

              }}
      out.write("\r\n");
      out.write("              <tr style=\"font-size: 1.75vw;font-weight: bolder;\">\r\n");
      out.write("                  <td>Total</td>\r\n");
      out.write("                  <td>");
      out.print( count);
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print( sum);
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");

           }
}
catch(Exception e)
{
System.out.println(e);
}
       
      out.write("\r\n");
      out.write("           </table>\r\n");
      out.write("           <form method=\"post\"><input type=\"submit\" value=\"Checkout\" style=\"margin-left: 5.0vw;font-size: 2.0vw;border: solid;background: transparent;\" formaction=\"websiteclone.jsp\"></form>\r\n");
      out.write("       </div>\r\n");
      out.write("    </body>\r\n");
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
