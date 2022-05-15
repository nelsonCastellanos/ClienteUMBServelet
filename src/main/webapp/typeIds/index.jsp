<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
	<link rel="stylesheet" href="client/index.css">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	</head>
  <body>


	<div class="topnav" id="myTopnav">
		<a href="client">Client <i class="fa fa-book"></i></a>
		<a href="employee">Employee <i class="fa fa-envelope"></i></a>
		<a href="comercialArea">Comercial Area <i class="fa fa-book"></i></a>
		<a href="typeIds"  class="active" aria-hidden="true">Type Ids<i class="fa fa-book"></i></a>
		<a href="logout">Logout <i class="fa fa-envelope"></i></a>
	</div>
	<section class="wrap-container">
        <div class="cont container">
            <div class="wrap-container-form">
				<form action="typeIds" method="post">
					<h2>Create a type id</h2>
					<input type="text" name="typeIdName" placeholder="Name" required />
					<input type="text" name="typeIdDescription" placeholder="Description" required />
					<input type="submit" name="" value="Create" />
					<p style="color:red">${message}</p>
				</form>
            </div>
			<table class="responsive-table">
				<!-- Responsive Table Header Section -->
				<thead class="responsive-table__head">
					<tr class="responsive-table__row">
						<th class="responsive-table__head__title responsive-table__head__title--typeId">Name</th>
						<th class="responsive-table__head__title responsive-table__head__title--nroId">Description</th>
					</tr>
				</thead>
				<!-- Responsive Table Body Section -->
				<tbody class="responsive-table__body">
					<c:forEach var="typeId" items="${typeIds}">
						<tr class="responsive-table__row">
							<td class="responsive-table__body__text responsive-table__body__text--typeId">
								${typeId.name}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--nroId">
								${typeId.description}
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
    </section>
</body>
	<script src="client/index.js"></script>
</html>

