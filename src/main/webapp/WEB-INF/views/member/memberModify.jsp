<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<span> 수정하려는 ID의 NAME을 입력하세요</span>
    <form:form commandName="memberModify">
     
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
                <td colspan="3" align="right"><input type="submit"
                    value='수정'></td>
            </tr>
        </table>
    </form:form>
    </div>
    
    	<div>
	<span> 수정하려는 ID의 NAME을 입력하세요</span>
    <form:form commandName="memberModify">
     
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
                <td colspan="3" align="right"><input type="submit"
                    value='수정'></td>
            </tr>
        </table>
    </form:form>
    </div>
</body>
</html>