<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learning Consultant</title>
</head> 
<body>
<h2>Welcome Learning Consultant</h2>
	<div align="center">
		<h1>Course List</h1>
		<div>
			<form:form id="courseSearchForm" modelAttribute="courseSearchForm" action="searchCourseProcess" method="post">
			<table border="0" width="70%">
				<tr>
					<th>Search : </th>
					<td><form:label path="cname">Course name: </form:label></td>
					<td><form:input path="cname" name="cname" id="cname" /></td>
					<td>&nbsp;</td>
					<td><form:label path="skillname">Skill: </form:label></td>
					<td><form:input path="skillname" name="skillname" id="skillname" /></td>
					<td>&nbsp;</td>
					<td><form:label path="plevel">Proficiency level: </form:label></td>
					<td><form:input path="plevel" name="plevel" id="plevel" /></td>
					<td>&nbsp;</td>
					<td><form:button id="search" name="search">Submit</form:button></td>
				</tr>
				<tr><td>&nbsp;</td></tr>	
			</table>
			</form:form>
		</div>
		<table border="1" width="70%">
			
			<th>Name</th>
			<th>Detail</th>
			<th>Skill</th>
			<th>Proficiency Level</th>
			<th>Action</th>

			<c:forEach var="course" items="${courseList}">
				<tr>

					<td>${course.courseName}</td>
					<td>${course.courseDetail}</td>
					<td>${course.skillDtl.skillName}</td>
					<td>${course.profeciencyLevel}</td>
					<td><a href="editCourse?id=${course.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteCourse?id=${course.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Add new course <a href="newCourse">here</a>
		</h4>
	</div>
</body>
</html>