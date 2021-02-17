<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입창</title>
<link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/egov.css'/>" />
</head>
<body>
  
    <form:form commandName="member">
        <form:errors />
        <table>
        
            <tr>
                <td><label for="name">이름</label></td>
                <td><form:input id="name" path="name" /></td>
              
            </tr>
            <tr>
                <td><label for="id">아이디</label></td>
                <td><form:input id="id" path="id" /></td>
              
            </tr>
            <tr>
                <td><label for="password">비밀번호</label></td>
                <td><form:input type = "password" id="password" path="password" /></td>
             
            </tr>
        

            <tr>
                <td colspan="3" align="right"><input type="submit"
                    value='회원가입'></td>
            </tr>
        </table>
    </form:form>
</body>
</html>