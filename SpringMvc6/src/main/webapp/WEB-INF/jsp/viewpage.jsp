<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  
<style>  
.error{color:red}  
</style>  
</head>  
<body>  
<form:form action="helloagain" modelAttribute="cust">  
Username: <form:input path="name"/> <br><br>  
Password(*): <form:password path="pass"/> <br><br> 
EmailId(*): <form:input path="email"/> <br><br> 
Contact(*): <form:input path="contact"/>  <br><br> 
City(*): <form:input path="city"/> <br><br> 
<form:errors path="pass" cssClass="error"/><br><br>  
<input type="submit" value="submit">  
</form:form>  
</body>  
</html> 