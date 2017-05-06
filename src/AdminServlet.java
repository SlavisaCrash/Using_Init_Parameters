import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Slavisa on 29.4.2017..
 */
public class AdminServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        ServletConfig cfg = this.getServletConfig();
        ServletContext ctx = this.getServletContext();

        out.println(cfg.getInitParameter("admin"));
        out.println(ctx.getInitParameter("admin"));
        out.println(ctx.getServerInfo());

    }
}
