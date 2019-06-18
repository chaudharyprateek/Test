<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<h2>Page</h2>
<form action="<c:url value="/updateCategory"/>" method="post">
<table align="center">
	
	<tr>


		<td> Category Id </td>
		<td><input type="number" name="catId "  value="${category.categoryId}" readonly></td>

	</tr>
	
	<tr>


		<td> Category Name</td>
		<td><input type="text" name="catName" value="${category.categoryName}"></td>

	</tr>
	<tr>
		<td>Category Description</td>
		<td><input type="text" name="catDesc" value="${category.categoryDesc}"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Update Category"/>
</tr>


</table>
</form>