<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Best search results</title>
<style>
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
<a href="website.jsp">  <img src="6.jpg" style="width:200px;height:90px;"></a>
<center>
    <br><br><h2><b>YOUR ORDER CART IS!!</b></h2><br>
    
	</center>
<%@page import="java.util.ArrayList,Modal.Item,javax.servlet.http.HttpSession;"%>
<%
    HttpSession sess=request.getSession();
    ArrayList<Item> l=(ArrayList<Item>)sess.getAttribute("itemlist");
    %>
</body>
</html>