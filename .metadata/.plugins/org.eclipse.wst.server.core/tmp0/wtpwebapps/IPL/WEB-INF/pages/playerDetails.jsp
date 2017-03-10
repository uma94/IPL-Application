<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<style>
header,footer,
article,section,
hgroup,nav,
figure{
	/* Giving a display value to the HTML5 rendered elements: */
	display:block;
	font:bold; 
}

article .line{
	/* The dividing line inside of the article is darker: */
	background-color:#15242a;
	border-bottom-color:#204656;
	margin:1.3em 0;
}

footer .line{
	margin:20em 0;
}

nav{
	background:url(img/gradient_light.jpg) repeat-x 50% 50% #f8f8f8;
	padding:0 5px;
	position:absolute;
	right:0;
	top:4em;

	border:1px solid #FCFCFC;

	-moz-box-shadow:0 1px 1px #333333;
	-webkit-box-shadow:0 1px 1px #333333;
	box-shadow:0 1px 1px #333333;
}

nav ul li{
	display:inline;
}

nav ul li a,
nav ul li a:visited{
	color:#565656;
	display:block;
	float:left;
	font-size:1.25em;
	font-weight:bold;
	margin:5px 2px;
	padding:7px 10px 4px;
	text-shadow:0 1px 1px white;
	text-transform:uppercase;
}

nav ul li a:hover{
	text-decoration:none;
	background-color:#f0f0f0;
}

nav, article, nav ul li a,figure{
	/* Applying CSS3 rounded corners: */
	-moz-border-radius:10px;
	-webkit-border-radius:10px;
	border-radius:10px;
}
#page{
	width:1340px;
	margin:0 auto;
	position:relative;
}

article{
	background-image:url(images/black-and-red-wallpaper-16.jpg);
	margin:3em 0;
	padding:20px;
	text-align:center;
}

figure{
	border:3px solid white;
	float:right;
	height:300px;
	margin-left:40px;
	overflow:hidden;
	width:300px;
	background-image:url(images/iip.png);
	padding: 3%;
}

figure:hover{
	-moz-box-shadow:0 0 2px #4D7788;
	-webkit-box-shadow:0 0 2px #4D7788;
	box-shadow:0 0 2px #4D7788;
	
}

figure img{
	margin-left:-60px;
}

/* Footer styling: */

footer{
	margin-bottom:30px;
	text-align:center;
	font-size:0.825em;
	margin-top: 420px;
}

footer p{
	margin-bottom:-2.5em;
	position:relative;
}

footer a,footer a:visited{
	color:#cccccc;
	background-color:#213e4a;
	display:block;
	padding:2px 4px;
	z-index:100;
	position:relative;
}

footer a:hover{
	text-decoration:none;
	background-color:#142830;
}

footer a.by{
	float:left;

}

footer a.up{
	float:right;
}
body
{
background-color: #F3FAB6;
}

</style>

<body background="images/wal.jpg">
<section id="page"> 
		<header>
			<img src="images/iplLogo.jpg" alt="logo" width="450px" height="150" />
			<nav class="clear"> 
				<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="about">About</a></li>
				<li><a href="contact">Contact</a></li>
				<li><a href="signout">Logout</a></li>
				</ul>
	</nav> </header>

<div class="line"></div>  <!-- Dividing line -->

	<article id="article1"> <!-- The new article tag. The id is supplied so it can be scrolled into view. -->
	<c:forEach var="player" items="${playerDetails}">
		<h2><font color="white">IPL Season 2017</font></h2>
	
			<font color="white"><marquee> ${player.name} Details</marquee></font>
		<div class="line"></div>

		<div class="articleBody clear">

		<figure> 
			
	<tr>
			<th>DisplayPicture</th>
			<td><img src="${player.displayPicture}" width="180px" height="180px"/></td>
			
			
		</tr>
		<div>
			<div><font color="white">Id: ${player.id}</font></div>
			<div></div>
	  	 </div>
	  	 
	   <div>
	        <div><font color="white">Role: ${player.role}</font></div>
			 <div></div>
		 </div>
		 
		 <div>
	        <div><font color="white">Batting Style: ${player.battingStyle}</font></div>
			 <div></div>
		 </div>
		 
		 <div>
	        <div><font color="white">Bowling Style: ${player.bowlingStyle}</font></div>
			
		 </div>
		 
		<div>
	        <div><font color="white">Nationality: ${player.nationality}</font></div>
			 <div></div>
		 </div>
		 
			
		<div>
	        <div><font color="white">DOB: ${player.dob}</font></div>
			 <div></div>
		 </div>
		 
		 <div>
	        <div><font color="white">Team ID: ${player.teamId}</font></div>
			 <div></div>
		 </div>
		 
			<div><font color="white"><a href="teamList">click here to go back team list</a></font></div>
			
		
			</figure>
			</div>
			</c:forEach>
			
			
			
	</article>
	
		</section>
	</body>
<footer>
	<div class="line"></div>

	<p><font color="white">&copy; Vivo IPL 2017 Schedule. All Rights Reserved.</font></p>
	<!-- Change the copyright notice --> <a href="#" class="up"><input
		type="button" value="Go Up"></a> </footer>
	
</html>