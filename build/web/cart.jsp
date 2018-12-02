


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="Controller.javaconnect"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.PrintWriter"%>
<body bgcolor="#E9967A">
    <a href="website.jsp">  <img src="7.png" style="width:200px;height:90px;"></a>
<div style="margin-top:10vw;margin-left: 36vw;">
      <h1 style="margin-left: 5.0vw;font-size: 2.0vw;">Your Cart</h1>
           <table cellspacing="20vw;" style="">
               <tr>
                   <th>Item Name</th>
                   <th>Quantity</th>
                   <th>Price</th>
               </tr>
              
       <% 
           try{
           PrintWriter pw=response.getWriter();
           double sum=0;
           System.out.println("chk 1.1");
           Connection con=javaconnect.connectDb();
           System.out.println("chk 1.2");
           Statement st=con.createStatement();
           ResultSet rs;
           String[] str;
           str=request.getParameterValues("chk_bx");
           
           System.out.println("chk 1");
           System.out.println(str[0]);
           for(int i=0;i<str.length;i++){
               System.out.print(str[i]+" ");
           }
           float count=0;
           if(str!=null){
               for(int i=0;i<str.length;i++){
                   //System.out.print(sports[i]+" ");
                   st.executeQuery("select itemname,price from itemlist where id='"+str[i]+"'");
                   rs=st.getResultSet();
                   while(rs.next()){
                       String nameVal=rs.getString("itemname");
                       //System.out.print(nameVal);
                       int c=rs.getInt("price");
                       System.out.println("chk 2");
                       System.out.println(c);
           
               sum+=c;
               System.out.println(sum);
               System.out.print(sum);
               int q=1;
               count++;%>
               <tr><td><%= rs.getString("itemname")%></td>
                   <td><%=q%></td>
                   <td><%= rs.getInt("price")%></td>
               </tr>
               <%
              }}%>
              <tr style="font-size: 1.75vw;font-weight: bolder;">
                  <td>Total</td>
                  <td><%= count%></td>
                  <td><%= sum%></td>
              </tr>
<%
           }
}
catch(Exception e)
{
System.out.println(e);
}
       %>
           </table>
           <form  method="post"><input type="submit" value="Checkout" style="margin-left: 5.0vw;font-size: 2.0vw;border: solid;background: transparent;" formaction="websiteclone.jsp"></form>
       </div>
    </body>
</html>