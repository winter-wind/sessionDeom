package cc.biibi.book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processStep")
public class ProcessStepServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取选中的图书信息
		String [] books = request.getParameterValues("book");//这里是一组数据，而getParameter是一个数据
		//2.把图书信息放入到HttpSession中
		request.getSession().setAttribute("books", books);
		//3.重写向页面到bookshoping/step-2.jsp
		response.sendRedirect(request.getContextPath()+"/bookshoping/step-2.jsp");//获取绝对路径
	}

}
