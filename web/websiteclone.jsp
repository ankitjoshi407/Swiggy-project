<!doctype html>
<html>
<head>
<link rel="shortcut icon" href="6.jpg" type="image/jpg">
<style text="text/css">


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
		
	#find {
    width: 300px;  height: 200px;
}
	

</style>
<title name="ab">Order food online from India's best food delivery service.Order from restaurants near you</title>
</head>
<body bgcolor="#F0F8FF"> 
   <h1 style="text-align:right">Welcome <%= session.getAttribute("name")%>!</h1> 
    <a href="websiteclone.jsp"> <img src="6.png" style="width:200px;height:90px;"></a>
  
   
   <a href="logout.jsp" style="float:right;"><button class="button">Log out</button></a>

<form action="FindFood">
<MARQUEE><h3><b>Late night at office?                                         Feeling Hungry?                                       Unexpected Guests?</b></h3></MARQUEE>
<center>
<p><h1>Order food from favourite restaurants near you</h1></p>
<select style="height:60px;width:390px" name="state">
  <option value="HimachalPradesh">Himachal Pradesh</option>
  <option value="Chandigarh">Chandigarh</option>
  <option value="Delhi">Delhi</option>
  <option value="Punjab">Punjab</option>
  
</select>

<input type="submit" value="submit" class="button" style="width:150px;height:50px"><br><br><br>
</form>


<font color="black">

<img src="food1.jpg" style="width:400px;height:325px;">
<img src="food2.jpg" style="width:400px;height:325px;">
<img src="food3.jpg" style="width:400px;height:325px;"><br><br>
<figure>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="no.jpg">
<figcaption>Order in for yourself or for the group,<br> with no restrictions on order value</figcaption>
</figure>
<figure>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="delivery.jpg" style="width:150px;height:90px;">
<figcaption>Order in for yourself or for the group,<br> with no restrictions on order value</figcaption>
</figure></center><br><br>
<div style = "height: 351px;background-color:#DEB887;">

<p style="font-size:30px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Restaurants in &nbsp;your pocket!!!!</b></p>
<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Order from your favorite restaurants & <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;track on the go, with the all-new Swiggy app.</b></p><br><br>

<a href="https://play.google.com/store/apps/details?id=in.swiggy.android"><img src="gplay.jpg" style="float: left;margin: 10px 10px 10px 50px;width:200px;height:80px;"></a>
<a href="https://itunes.apple.com/in/app/swiggy-food-order-delivery/id989540920"><img src="iplay.jpg" style="float: left;margin: 10px 10px 10px 50px;width:200px;height:80px;"></a>
<img src="phones.jpg" style="width:200px;height:200px;float: right;">
</div>
<center>
<div style = "height: 50px;background-color:black;">
    <p style="font-size:30px;color:white">© 2018 Swiggy</p>
</div>
</center>

</body>


</html>