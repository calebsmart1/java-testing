/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package web.javatest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
<<<<<<< HEAD
 * Servlet for PostServlet.
 * @author caleb
 */
@WebServlet(name="PostServlet", urlPatterns={"/post"})
public class PostServlet extends HttpServlet {
=======
 * Servlet for ErrorExampleServlet.
 * @author caleb
 */
@WebServlet(name="ErrorExampleServlet", urlPatterns={"/post"})
public class ErrorExampleServlet extends HttpServlet {
>>>>>>> 48850a67943c65e3531133fbd85a949ad0d29b93

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
<<<<<<< HEAD
        // Handle GET request
=======

>>>>>>> 48850a67943c65e3531133fbd85a949ad0d29b93
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
<<<<<<< HEAD
        String text = request.getParameter("text");
        response.setContentType("text/html");
        response.getWriter().println("You entered: " + text);
=======
        request.getParameter("text");
        String text = request.getParameter("text");
        response.setContentType("text/html");
        response.getWriter().println("<p>" + text + "</p>");
>>>>>>> 48850a67943c65e3531133fbd85a949ad0d29b93
    }
}
