
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodayServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 response.setContentType("text/html");
         response.setCharacterEncoding("utf-8");
         Calendar c=Calendar.getInstance();
         int year=c.get(Calendar.YEAR);
         int month=c.get(Calendar.MONTH);
         int day=c.get(Calendar.DATE);
         int hour=c.get(Calendar.HOUR_OF_DAY);
         int minute=c.get(Calendar.MINUTE);
         int second=c.get(Calendar.SECOND);
         PrintWriter out=response.getWriter();
         out.write("<HTML><HEAD><TITLE>현재시간</TITLE></HEAD>");
         out.write("<BODY>");
         out.write("<H2><A HREF=\"http://localhost:8080/aboutme/index.html\">메인화면</A><H2>");
         out.write("<H1>");
         out.write("현재시간: ");
         out.write(Integer.toString(year));
         out.write("/");
         out.write(Integer.toString(month));
         out.write("/");
         out.write(Integer.toString(day));
         out.write(" ");
         out.write(Integer.toString(hour));
         out.write("시");
         out.write(Integer.toString(minute));
         out.write("분");
         out.write(Integer.toString(second));
         out.write("초");
         out.write("</H1></BODY></HTML>");
         out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
