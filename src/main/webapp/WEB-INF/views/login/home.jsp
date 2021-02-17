<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
padding: 0px;
margin:0px;
}
body {
    background-color: #f8f8ff;
}

#header {
    background: #fff;
    color: #555f66;
    cursor: default;
    height: 3em;
    left: 0;
    line-height: 3em;
    position: static;
    top: 0;
    width: 100%;
    z-index: 10000;
    box-shadow: 0 0 0.1em 0 rgba(0, 0, 0, 0.25);
}

#header h1 {
    color: #666f77;
    font-weight: 500;
    height: inherit;
    left: 1.25em;
    line-height: inherit;
    margin: 0;
    padding: 0;
    position: absolute;
    top: 0;
}

#header h1 a {
    font-size: 1.25em;
}

#header nav {
    height: inherit;
    line-height: inherit;
    position: absolute;
    right: 1.25em;
    top: 0;
    vertical-align: middle;
}

#header nav>ul {
    list-style: none;
    margin: 0;
    padding-left: 0;
}

#header nav>ul>li {
    border-radius: 6px;
    display: inline-block;
    margin-left: 2em;
    padding-left: 0;
}

#header nav>ul>li.loginId {
    font: bold;
    color: red;
  
}


#header nav>ul>li a {
    -moz-transition: color 0.2s ease-in-out;
    -webkit-transition: color 0.2s ease-in-out;
    -o-transition: color 0.2s ease-in-out;
    -ms-transition: color 0.2s ease-in-out;
    transition: color 0.2s ease-in-out;
    color: #555f66;
    display: inline-block;
    text-decoration: none;
}

#header nav>ul>li a:hover {
    color: #629DD1;
}

#header nav>ul>li:first-child {
    margin-left: 0;
}

#header nav>ul>li .button {
    height: 2.25em;
    line-height: 2.25em;
    margin-bottom: 0;
    padding: 0 1em;
    position: relative;
    top: -0.075em;
    vertical-align: middle;
}

#header .container {
    position: relative;
}

#header .container h1 {
    left: 0;
}

#header .container nav {
    right: 0;
}
#header #nav #current {
color: #629DD1;
}
#main{
width : 60%;
margin-top : 10%;
margin-left: 20%;
margin-right: 20%;

}
#main table{
width: 100%;
text-align: center;
overflow: scroll;
}

table button{
width: 100%;
}

table.table_wrap {
  border-collapse: collapse;
  text-align: left;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  border-bottom: 1px solid #ccc;
  margin: 20px 10px;
}
table.table_wrap th {
  width: 150px;
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
}
table.table_wrap td {
  width: 350px;
  padding: 10px;
  vertical-align: top;
}
table.table_wrap tr:nth-child(even) {
  background: #efefef;
}
</style>

</head>
<body>




    <header id="header">
    <h1>
       <span>Geomex</span>
    </h1>
    <nav id="nav">
    <ul>
        <li><a href="#" id="current">Home</a></li>
        <li><a href="#">Vote</a></li>
        <li class = "loginId">
        <%
        String id = session.getAttribute("user").toString();
        out.print(id);
        %>
        </li>
        <li>
            <form>
                 <a href="logout.min">Logout</a>
            </form>
        </li>
    </ul>


    </nav> 
    </header>
   
    
        <main id="main">
     	</main>

</body>
</html>