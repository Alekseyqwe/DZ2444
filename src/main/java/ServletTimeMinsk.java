import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.module.InvalidModuleDescriptorException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/minskTime")
public class ServletTimeMinsk extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, InvalidModuleDescriptorException, IOException {
        String p = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
        Date date = new Date();
        String t = simpleDateFormat.format(date);
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>" + "MinskTime: " + date + "</h1>");
        writer.close();
    }
}

  /*  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, InvalidModuleDescriptorException, IOException {
        response.setContentType("text/html");
        Date date = new Date();
        System.out.println("Date");
        PrintWriter writer = response.getWriter(date);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        Date date = new Date();
        System.out.println("Date");
        PrintWriter writer=null;
        try {
            writer = response.getWriter();
        }catch (IOException e) {
            System.out.println(e);
        }
        writer.print(date);
    }*/


