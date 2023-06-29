import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Washington extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String p = ("HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
        TimeZone timeZone = TimeZone.getTimeZone("GMT-4");
        simpleDateFormat.setTimeZone(timeZone);
        Date d = new Date();
        String t = simpleDateFormat.format(d);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + "WashingtonTime: " + d + "</h1>");
        writer.close();
    }
}
