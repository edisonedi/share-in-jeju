<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
    #columns{
        column-width: 350px;
        column-gap: 15px;
    }
    #columns figure{
        display: inline-block;
        border: 1px solid rgba(0, 0, 0, 0.2);
        margin: 0;
        margin-bottom: 15px;
        padding: 10px;
        box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.5);
    }
     #columns figure img{
        width: 100%;
    }
    #columns figure figcaption{
        border-top: 1px solid rgba(0, 0, 0, 0.2);
        padding: 10px;
        margin-top: 11px;
    }
    </style>
</head>
<body>
    <div id="columns">
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/spider.jpg">
          <figcaption>스파이더맨 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/spiderman.jpg">
          <figcaption>역동적인 스파이더맨 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/ironman.jpg">
          <figcaption>아이언맨 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/jocker.jpg">
          <figcaption>다크나이트 조커 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/godamcity.jpg">
          <figcaption>고담시티 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/superman.jpg">
          <figcaption>슈퍼맨 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/Frozen.jpg">
          <figcaption>엘사 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/짱구.jpg">
          <figcaption>짱구 배경화면</figcaption>
    </figure>
    <figure>
        <img src="C:/Users/이진욱/Desktop/새 폴더/images/jje.jpg">
          <figcaption>징징이 배경화면</figcaption>
    </figure>
</div>
</body>
</html>




<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Gridify</title>
<link rel="stylesheet" type="text/css" href="${path }/resources/bootstrap/css/style.css">
</head>
<body>
<div class="container">
	<div data-gridify="4-columns">
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/150x200"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/300"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/500x300"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/200x500"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/250"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/300"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/150x400"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/300"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/500x300"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/300x700"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/150"></div>
		<div class="item"><img class="img-fluid" src="http://www.placehold.space/300"></div>
	</div>
</div>
<script type="text/javascript" src="${path }/resources/bootstrap/js/gridify.min.js"></script>
<script type="text/javascript">
window.onload = function() {
	gridify.init();
};
</script>
</body>
</html> --%>