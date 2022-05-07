<!DOCTYPE html>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="client/index.css">
	<link rel="stylesheet" href="index.css">
</head>
<body>
	<section>
		<div class="container">
			<div class="user signinBx">
				<div class="tabs">
					<input type="radio" name="tab" id="tab1" checked="checked">
					<label for="tab1">Crear Contacto</label>
					<input type="radio" name="tab" id="tab2">
					<label for="tab2">Lista de contactos</label>
					<div class="tab-content-wrapper">
						<div id="tab-content-1" class="tab-content">
							<form action="register" method="post">
								<h2>Create an client</h2>
								<input type="text" name="typeId" placeholder="Type Id" required />
								<input type="text" name="nroId" placeholder="Number Id" required />
								<input type="text" name="name" placeholder="Name" required />
								<input type="text" name="lastName" placeholder="Last Name" required />
								<input type="text" name="phoneNumber" placeholder="Phone Number" required />
								<input type="text" name="email" placeholder="email" required />
								<input type="submit" name="" value="Create" />
								<p style="color:red">${message}</p>
							</form>
						</div>
						<div id="tab-content-2" class="tab-content">

						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec efficitur mattis nibh, non ornare neque. In bibendum consequat imperdiet. Duis eros ex, vestibulum vel fermentum ut, gravida at turpis. Etiam porta sem dolor, at finibus metus consequat a. Aliquam erat volutpat.  </p>
						</div>
					</div>
				</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
