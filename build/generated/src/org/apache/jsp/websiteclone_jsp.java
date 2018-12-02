package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class websiteclone_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"6.jpg\" type=\"image/jpg\">\r\n");
      out.write("<style text=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\t\t  border-radius: 2px;\r\n");
      out.write("\t\t  background-color: DarkOrange;\r\n");
      out.write("\t\t  border: none;\r\n");
      out.write("\t\t  color: #333;\r\n");
      out.write("\t\t  text-align: center;\r\n");
      out.write("\t\t  font-size: 26px;\r\n");
      out.write("\t\t  padding: 5px;\r\n");
      out.write("\t\t  cursor: pointer;\r\n");
      out.write("\t\t  margin: 5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t#find {\r\n");
      out.write("    width: 300px;  height: 200px;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title name=\"ab\">Order food online from India's best food delivery service.Order from restaurants near you</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#F0F8FF\"> \r\n");
      out.write("   <h1 style=\"text-align:right\">Welcome");
      out.print( session.getAttribute("name"));
      out.write("!</h1> \r\n");
      out.write("    <a href=\"website.jsp\"> <img src=\"6.jpg\" style=\"width:200px;height:90px;\"></a><br>\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("   <a href=\"logout.jsp\" style=\"float:right;\"><button class=\"button\">Log out</button></a>\r\n");
      out.write("\r\n");
      out.write("<form action=\"FindFood\">\r\n");
      out.write("<MARQUEE><h3><b>Late night at office?                                         Feeling Hungry?                                       Unexpected Guests?</b></h3></MARQUEE>\r\n");
      out.write("<center>\r\n");
      out.write("<p><h1>Order food from favourite restaurants near you</h1></p>\r\n");
      out.write("<select style=\"height:60px;width:390px\" name=\"state\">\r\n");
      out.write("  <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("  <option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("  <option value=\"Delhi\">Delhi</option>\r\n");
      out.write("  <option value=\"Punjab\">Punjab</option>\r\n");
      out.write("  \r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"submit\" class=\"button\" style=\"width:150px;height:50px\"><br><br><br>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<font color=\"black\">\r\n");
      out.write("\r\n");
      out.write("<img src=\"food1.jpg\" style=\"width:400px;height:325px;\">\r\n");
      out.write("<img src=\"food2.jpg\" style=\"width:400px;height:325px;\">\r\n");
      out.write("<img src=\"food3.jpg\" style=\"width:400px;height:325px;\"><br><br>\r\n");
      out.write("<figure>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"no.jpg\">\r\n");
      out.write("<figcaption>Order in for yourself or for the group,<br> with no restrictions on order value</figcaption>\r\n");
      out.write("</figure>\r\n");
      out.write("<figure>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"delivery.jpg\" style=\"width:150px;height:90px;\">\r\n");
      out.write("<figcaption>Order in for yourself or for the group,<br> with no restrictions on order value</figcaption>\r\n");
      out.write("</figure></center><br><br>\r\n");
      out.write("<div style = \"height: 351px;background-color:#DEB887;\">\r\n");
      out.write("\r\n");
      out.write("<p style=\"font-size:30px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Restaurants in &nbsp;your pocket!!!!</b></p>\r\n");
      out.write("<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Order from your favorite restaurants & <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;track on the go, with the all-new Swiggy app.</b></p><br><br>\r\n");
      out.write("\r\n");
      out.write("<a href=\"https://play.google.com/store/apps/details?id=in.swiggy.android\"><img src=\"gplay.jpg\" style=\"float: left;margin: 10px 10px 10px 50px;width:200px;height:80px;\"></a>\r\n");
      out.write("<a href=\"https://itunes.apple.com/in/app/swiggy-food-order-delivery/id989540920\"><img src=\"iplay.jpg\" style=\"float: left;margin: 10px 10px 10px 50px;width:200px;height:80px;\"></a>\r\n");
      out.write("<img src=\"phones.jpg\" style=\"width:200px;height:200px;float: right;\">\r\n");
      out.write("</div>\r\n");
      out.write("<center>\r\n");
      out.write("<div style = \"height: 50px;background-color:black;\">\r\n");
      out.write("    <p style=\"font-size:30px;color:white\">© 2018 Swiggy</p>\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
