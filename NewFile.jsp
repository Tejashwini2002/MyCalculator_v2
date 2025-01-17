<!-- I want to KEEP the output in the html page. So for this I require JSP page in which you can get the things because in the jsp file you can write html code as well as Java code.  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Calculator</title>
<link rel="stylesheet" type="text/css" href = "index.css">
<!-- 
<style>
	img{
		height: 20px;
		width: 20px;
	}
</style>
-->
<!--  
<style>
	body {
	  font-size: 40px;
	  text-align:center;
	  background: linear-gradient(to right,  rgb(125, 138, 255),rgb(23, 62, 89));
	}
	
	h1,h3{
	color: white;
	margin:12px;
	}
	input, button {
	  font-size:40px;
	  color: rgb(0, 0, 0);
	  border-radius: 5%;
	  background-color: rgb(192, 192, 192);
	  border: 2px solid white;
	}
	
	img{
	width: 20%;
	height:20%;
	margin-top: 20px;
	}
	img:hover{
	  -ms-transform: scale(1.1); /* IE 9 */
	  -webkit-transform: scale(1.1); /* Safari 3-8 */
	   transform: scale(1.1); 
	}
	
</style>
-->
</head>

<body>
<div class = "container">
<img src="images\doraemon-laugh.gif">

<h4>Joke of the Day</h4>
<h5>Joke = <%=request.getParameter("joke")%></h5>


<div class = "form2_div">
<form action = "MyServlet" method = "post">
	<input name = "num1" placeholder="First Number"></input>
	<input name = "num2" placeholder="Second Number"></input>
	<br>
	<div class = "button_container">
	<button name="bt1" value="1"> + </button>
	<button name="bt1" value="2"> - </button>
	<button name="bt1" value="3"> * </button>
	<button name="bt1" value="4"> / </button>
	</div>
</form>
</div>

<div class = "answer">
<h1>Ans = <%=request.getParameter("ans")%></h1>
</div>


<br>
<h6>Made by @Tejashwini U Hosur</h6>
</div>
</body>
</html>