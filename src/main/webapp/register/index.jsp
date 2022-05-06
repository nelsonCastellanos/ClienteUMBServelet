<!DOCTYPE html>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
  <section>
    <div class="container">
      <div class="user signupBx">
        <div class="formBx">
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
          </form>
        </div>
        <div class="imgBx"><img src="https://raw.githubusercontent.com/WoojinFive/CSS_Playground/master/Responsive%20Login%20and%20Registration%20Form/img2.jpg" alt="" /></div>
      </div>
    </div>
  </section>
</body>
</html>
