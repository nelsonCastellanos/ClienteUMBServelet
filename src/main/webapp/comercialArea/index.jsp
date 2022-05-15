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
		<a href="comercialArea"  class="active" aria-hidden="true">Comercial Area <i class="fa fa-book"></i></a>
		<a href="typeIds">Type Ids<i class="fa fa-book"></i></a>
		<a href="logout">Logout <i class="fa fa-envelope"></i></a>
	</div>
	<section class="wrap-container">
        <div class="cont container">
            <div class="wrap-container-form">
				<form action="comercialArea" method="post">
					<h2>Create Commercial Area</h2>
					<input type="text" name="comercialAreaName" placeholder="Name" required />
					<input type="text" name="comercialAreaDescription" placeholder="Description" required />
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
					<c:forEach var="commercialArea" items="${commercialAreas}">
						<tr class="responsive-table__row">
							<td class="responsive-table__body__text responsive-table__body__text--typeId">
								${commercialArea.name}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--nroId">
								${commercialArea.description}
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

