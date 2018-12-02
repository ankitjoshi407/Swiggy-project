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
a {
color:DarkOrange;

}
p{
	color:red;
}

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
<a href="logout.jsp" style="float:right;"><button class="button">Log out</button></a><br>
<a><div id="w" style="color: white;float:right;font-size: 18;">Cart: Empty</div></a>


<center>
    <br><br><br><br><p><h1 style="color:black;">DELICIOUS FOOD FOR YOU!!</h1></p><br><br>
	
	</center>
	 
	
	
	<script type = "text/javascript">
	 var c=0;   
	 function update_value(chk_bx){
		      if(chk_bx.checked)
		         {
		             var a="checked";
		 	   c+=1;
		 }
		         else{
		             var a="not checked";
		 		if(c>0){
		 			c-=1;
		 		0}else if(c==0){
		 			c=0;
		 		}
		         }
		      if (c==0)
		    	  {
			         document.getElementById('w').innerHTML ='Cart : Empty';

		    	  }else{
		         document.getElementById('w').innerHTML ='Cart : '+c+'';
		    	  }
		     }
	</script>
	
	<%@page import="java.util.ArrayList,Modal.*"%>
	<%
	ArrayList <Item> l = new ArrayList<Item>();
	ItemDAO hd = new ItemDAO();
	l = hd.showItems();
	
	//ArrayList <Item> cart = new ArrayList<Item>();
	%>
	<form action = "cart.jsp" method="post">
        <table cellspacing=15 align=center>
	<tr>
	<%
	int i = 1;
	for(Item e : l)
	{
	%>
	 
	   <td>
	    <table style="height:250px;width:300px;border:solid;">
	    <tr>
	        <td colspan=2>
	          <img src="newpage<%=i%>.jpg" style="width:300px;height:160px;">
            </td>
		</tr>
	    <tr>
	        <td>
				<p><%=e.getItemname()%></p>
	        </td>
	        <td rowspan=2>
	            
	            <!-- <input type="submit"  style="float:center;color: green;background-color: orange" value="Add to Cart"> -->
				<input type="checkbox" onchange = "update_value(this)" value="<%=e.getId()%>" name = "chk_bx"> Add to cart
                                
	        </td>
	    </tr>
		<tr>
			<td>
			  <p>Buy for Rs.<%=e.getPrice()%></p>
			</td>
		</tr>
		</table>
	  </td>
	  <%
	  if(i%4 == 0)
	  {
		  out.println("</tr><tr>");
	  }

		i++;
	}
	%>
	</tr>
        </table>
	<center>
	
	
	<button type="submit"> Checkout </button>
	</center>
	</form>
	
	</body>
</html>
<%
    }
%>