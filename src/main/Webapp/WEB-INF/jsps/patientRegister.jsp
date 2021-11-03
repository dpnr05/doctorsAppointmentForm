<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patient Registration</title>
</head>
<body>
<form action="patientRegistration" method="post" enctype="multipart/form-data">
<pre>
Id: <input type="text" name="id"/>
Name:<input type="text" name="name"/>
Age:<input type="text" name="age"/>
Dob:<input type="text" name="dob"/>
Adress:<input type="text" name="adress"/>
BloodGroup:<input type="text" name="bloodGroup"/>
MobileNumber:<input type="text" name="mobileNumber"/>
eMail:<input type="text" name="eMail"/>
DateOfAppointment:<input type="text" name="dateOfAppointment"/>
PatientReport:<input type="file" name="report"/>
<input type="submit" name="submit" value="Upload"/>
</pre>
</form>
</body>
</html>