<!DOCTYPE html>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
  <section>
    <div class="container">
      <div class="user signinBx">
        <div class="imgBx"><img src="https://raw.githubusercontent.com/WoojinFive/CSS_Playground/master/Responsive%20Login%20and%20Registration%20Form/img1.jpg" alt="" /></div>
        <div class="formBx">
          <form action="login" method="post">
            <h2>Sign In</h2>
            <input type="text" name="email" placeholder="Email" />
            <input type="password" name="password" placeholder="Password" />
            <input type="submit" name="" value="Login" />
            <p class="signup">
              Don't have an account ?
              <a href="register" onclick="toggleForm();">Sign Up.</a>
            </p>
          </form>
        </div>
      </div>
    </div>
  </section>
</body>
</html>
