<%
    if(session.getAttribute("name") == null)
    {
        response.sendRedirect("login.jsp");
    }
    else
    {
%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Best search results</title>
<style>
    
.button {
		  border-radius: 2px;
		  background-color: DarkOrange;
		  border: none;
		  color: #333;
		  text-align: center;
		  font-size: 26px;
		  padding: 5px;
		  cursor: pointer;
		  margin: 5px;
		}
a {
color:DarkOrange;

}
p{
	color:red;
}
body
{
	
	 height: 100%; 

 
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

</style>
</head>
<body bgcolor="#E9967A">
     <h1 style="text-align:right">Welcome <%= session.getAttribute("name")%>!</h1> 
<a href="website.jsp">  <img src="7.png" style="width:200px;height:90px;"></a>
 <a href="logout.jsp" style="float:right;"><button class="button">Log out</button></a>
<center>
    <br><br><br><br><p><h1 style="color:black;">BEST SEARCH RESULTS FOR YOU!!</h1></p>
	</center>

<%@page import="java.util.ArrayList,Modal.Hotel,javax.servlet.http.HttpSession;"%>
<%
    HttpSession sess=request.getSession();
    ArrayList<Hotel> l=(ArrayList<Hotel>)sess.getAttribute("hotellist");
    %>
    <center>
    <table border="1" style="border-collapse:collapse;width:100%;height:20%;">
        <tr>
            
            <th>Name</th> 
            <th>State</th>
            <th>Address</th>
            <th>Mobile number</th>
            <th>Photo</th>
            <th>Link </th>
        </tr>
    </center>
        <%
            for(int i=0;i<l.size();i++)
            {
                
            
            %>
            <tr>
                <td><center><%=l.get(i).getName()%></center></td>
                <td><center><%=l.get(i).getAddress()%></center></td>
                <td><center><%=l.get(i).getState()%></center></td>
                <td><center><%=l.get(i).getMno()%></center></td>
                <td><center><img src="download<%=i%>.jpg" alt="" width="50%" height="80%"></img></center></td>
                <td><center><a href="newpage.jsp" style="color:red;">Click to Order!</a></center></td>
        
        </tr>
            <%
                }
                %>
    </table>
	</body>
</html>
<%
    }
%>