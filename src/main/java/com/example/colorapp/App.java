package com.example.colorapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/")
public class App extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println(
            "<html>" +
                "<head><title>Colorful Java App</title></head>" +
                "<body style='background-color: coral; text-align: center;'>" +
                "<h1 style='color: white;'>Welcome to the Colorful Java App!</h1>" +
                "<p style='color: yellow;'>Deploying Java Applications with Jenkins and Docker!</p>" +
                "</body>" +
            "</html>"
        );
    }
}

