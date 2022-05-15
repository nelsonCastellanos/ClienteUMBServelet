<!DOCTYPE html>
<html>
<head>
    <title>UMB Clientes</title>
    <link rel="stylesheet" href="index.css">
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    </head>
  <body>
    <section class="wrap-container">
        <div class="cont container">
            <div class="wrap-container-text">
                <p>UMB Creación de clientes.</p>
                <h6>Cliente</h6>
                <p class="address">
                    "Por fin he entendido lo que significa 'upward compatible' (compatible hacia arriba). Significa que mantenemos todos nuestros viejos errores"

                    -- Dennie van Tassel
                </p>
                <h6>Email</h6>
                <p class="mail">nelsongarzon0000@gmail.com@gmail.com</p>
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

