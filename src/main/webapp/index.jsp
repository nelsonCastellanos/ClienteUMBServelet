<!DOCTYPE html>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
</head>
  <body>
    <section class="wrap-container">
        <div class="cont container">
            <div class="wrap-container-text">
                <p>Drop your inquiry here and our experts will get back to you.</p>
                <h6>Address</h6>
                <p class="address">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Distinctio, rerum.
                </p>
                <h6>Email</h6>
                <p class="mail">wrap-containerus@gmail.com</p>
            </div>
            <div class="wrap-container-form">
                 <form action="login" method="post">
                  <h2>Sign In</h2>
                  <input type="text" name="email" placeholder="Email" />
                  <input type="password" name="password" placeholder="Password" />
                  <input type="submit" name="" value="Login" />
                  <p class="signup">
                    Don't have an account ?
                    <a href="register" onclick="toggleForm();">Sign Up.</a>
                  </p>
                  <p style="color:red">${message}</p>
              </form>
            </div>
        </div>
    </section>
</body>
</html>

