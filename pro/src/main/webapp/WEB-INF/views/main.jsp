<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="header.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<style>
#columns {
	column-width: 350px;
	column-gap: 15px;
}

#columns figure {
	display: inline-block;
	border: 1px solid rgba(0, 0, 0, 0.2);
	margin: 0;
	margin-bottom: 15px;
	padding: 10px;
	box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.5);;
}

#columns figure img {
	width: 100%;
}

#columns figure figcaption {
	border-top: 1px solid rgba(0, 0, 0, 0.2);
	padding: 10px;
	margin-top: 11px;
}
</style>
</head>
<body>
	<div class="nav">
		<ul id="nav2" class="nav justify-content-center bg-light">
			<li class="nav-item"><a class="nav-link active" href="#">Home</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Link1</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link2</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link3</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link4</a></li>
			<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
			</li>
		</ul>
	</div>

	<div id="columns">
		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/cinderella.jpg">
			<figcaption>Cinderella wearing European fashion of the
				mid-1860’s</figcaption>
		</figure>

		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/rapunzel.jpg">
			<figcaption>Rapunzel, clothed in 1820’s period fashion</figcaption>
		</figure>

		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/belle.jpg">
			<figcaption>Belle, based on 1770’s French court fashion</figcaption>
		</figure>

		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/mulan_2.jpg">
			<figcaption>Mulan, based on the Ming Dynasty period</figcaption>
		</figure>

		<figure>
			<img
				src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/sleeping-beauty.jpg">
			<figcaption>Sleeping Beauty, based on European fashions
				in 1485</figcaption>
		</figure>

		<figure>
			<img
				src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/pocahontas_2.jpg">
			<figcaption>Pocahontas based on 17th century Powhatan
				costume</figcaption>
		</figure>

		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/snow-white.jpg">
			<figcaption>Snow White, based on 16th century German
				fashion</figcaption>
		</figure>

		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/ariel.jpg">
			<figcaption>Ariel wearing an evening gown of the 1890’s</figcaption>
		</figure>

		<figure>
			<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/tiana.jpg">
			<figcaption>
				Tiana wearing the <i>robe de style</i> of the 1920’s
			</figcaption>
		</figure>
		<small>Art &copy; <a href="//clairehummel.com">Claire
				Hummel</a></small>
	</div>
</body>
</html>