<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    Tell me what you got.
    <form:form commandName="account">
        <p>
            <label for="id">id</label>
            <form:input id="id" path="id" />
        </p>
        <p>
            <label for="password">password</label>
            <form:password id="password" path="password" />
        </p>
        <p>
            <label for="name">name</label>
            <form:input id="name" path="name" />
        </p>
        <p>
            <input type="submit" value='Sign up!'>
        </p>
    </form:form>
</body>
</html>