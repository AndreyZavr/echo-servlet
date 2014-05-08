import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
//@WebServlet("/echo")
public class EchoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm");
        String date = sdf.format(new Date());

        String text = req.getParameter("text");
        if (text == null) {
            text = "";
        }
        out.println(text + " : " + date);
    }

}
