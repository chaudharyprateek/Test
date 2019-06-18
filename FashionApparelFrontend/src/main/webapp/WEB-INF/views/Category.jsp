<%@include file="Header.jsp"%>
<h2 align="center">Manage Category </h2>
<form action="<c:url value="/InsertCategory"/>" method="post">
<table align="center">
	<tr>


		<td> Category Name</td>
		<td><input type="text" name="catName"/></td>

	</tr>
	<tr>
		<td>Category Description</td>
		<td><input type="text" name="catDesc"/></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Insert Category"/>
</tr>


</table>
</form>
<table align="center">  

<tr>
<td>Category ID</td>
<td>Category Name</td>
<td>Category Desc</td>
<td>Operation</td>
</tr>
<c:forEach items="${categoryList}" var="category">
<tr>
	<td>${category.categoryId}</td>
	<td>${category.categoryName}</td>
	<td>${category.categoryDesc}</td>
	<td>
<a href="<c:url value="/deleteCategory/${category.categoryId}"/>">Delete</a>

<a href="<c:url value="/editCategory/${category.categoryId}"/>">Edit</a>
</td>

 
</tr>
</c:forEach>
</table>
