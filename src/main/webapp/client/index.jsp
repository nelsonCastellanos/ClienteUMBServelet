<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
	<link rel="stylesheet" href="client/index.css">
</head>
  <body>

    <section class="wrap-container">
        <div class="cont container">
            <div class="wrap-container-form">
				<form action="client" method="post">
					<h2>Create an client</h2>
					<select name="typeId">
						<c:forEach var="item" items="${typeIds}">
							<option value="${item.id}">${item.name}</option>
						</c:forEach>
					</select>
					<input type="text" name="nroId" placeholder="Number Id" required />
					<input type="text" name="name" placeholder="Name" required />
					<input type="text" name="lastName" placeholder="Last Name" required />
					<input type="text" name="phoneNumber" placeholder="Phone Number" required />
					<input type="email" name="email" placeholder="Email" required />
					<input type="submit" name="" value="Create" />
					<p style="color:red">${message}</p>
				</form>
            </div>
			<table class="responsive-table">
				<!-- Responsive Table Header Section -->
				<thead class="responsive-table__head">
					<tr class="responsive-table__row">
						<th class="responsive-table__head__title responsive-table__head__title--typeId">Type ID</th>
						<th class="responsive-table__head__title responsive-table__head__title--nroId">Nro Id</th>
						<th class="responsive-table__head__title responsive-table__head__title--name">Name</th>
						<th class="responsive-table__head__title responsive-table__head__title--lastName">Last Name</th>
						<th class="responsive-table__head__title responsive-table__head__title--phoneNumber">Phone Number</th>
						<th class="responsive-table__head__title responsive-table__head__title--email">Email</th>
					</tr>
				</thead>
				<!-- Responsive Table Body Section -->
				<tbody class="responsive-table__body">
					<c:forEach var="client" items="${clients}">
						<tr class="responsive-table__row">
							<td class="responsive-table__body__text responsive-table__body__text--typeId">
								${client.typeId.name}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--nroId">
								${client.nroId}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--name">
								${client.name}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--lastName">
								${client.lastName}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--phoneNumber">
								${client.phoneNumber}
							</td>
							<td class="responsive-table__body__text responsive-table__body__text--email">
								${client.email}
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

