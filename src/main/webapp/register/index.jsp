<!DOCTYPE html>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
</head>
  <body>
    <section class="wrap-container">
        <div class="cont container">
            <div class="wrap-container-form">
              <form action="register" method="post">
                <h2>Create an account</h2>
                <input type="text" name="username" placeholder="Username" required />
                <input type="email" name="email" placeholder="Email Address" required />
                <input type="password" name="password" placeholder="Create Password" required />
                <input type="submit" name="" value="Sign Up" />
                <p class="signup">
                  Already have an account ?
                  <a href="login" onclick="toggleForm();">Sign in.</a>
                </p>
                <p style="color:red">${message}</p>
              </form>
            </div>
        </div>
    </section>
</body>
</html>

