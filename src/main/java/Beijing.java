import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Beijing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String p = ("HH:mm:ss");
        SimpleDateFormat df = new SimpleDateFormat(p);
        TimeZone t = TimeZone.getTimeZone("Asia/Shanghai");
        df.setTimeZone(t);
        Date d = new Date();
        String time = df.format(d);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + "Время в Пекине: " + time + "</h1>");
        writer.close();
    }

}
