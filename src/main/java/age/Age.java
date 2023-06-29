package age;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/agee")
public class Age extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        int age = Integer.parseInt(req.getParameter("age"));
        if (age >= 18) {
            writer.println("You are an adult. Welcome to the site");
        } else {
            writer.println("You are not 18 years old. This site is prohibited!");
        }
        writer.close();
    }
}



