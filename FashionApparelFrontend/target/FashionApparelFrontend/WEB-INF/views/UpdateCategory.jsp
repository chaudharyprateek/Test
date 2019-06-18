<%@include file="Header.jsp" %>
<h2>Page</h2>
<form action="<c:url value="/updateCategory"/>" method="post">
<table align="center">
	
	<tr>


		<td> Category Id </td>
		<td><input type="text" name="catId " readonly value="${category.categoryId}"/></td>

	</tr>
	
	<tr>


		<td> Category Name</td>
		<td><input type="text" name="catName" value="${category.categoryName}"/></td>

	</tr>
	<tr>
		<td>Category Description</td>
		<td><input type="text" name="catDesc" value="${category.categoryDesc}"/></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Update Category"/>
</tr>


</table>
</form>