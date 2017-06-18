package cc.biibi.book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/processStep2")
public class ProcessStep2Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取请求参数：name,address, cardType,card
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String cardType = request.getParameter("cardType");
		String card = request.getParameter("card");
		//方便获取，进行封装
		Customer customer = new Customer(name,address, cardType,card);
		
		//2.把请求信息存入到HttpSession中
		HttpSession session = request.getSession();
		session.setAttribute("customer", customer);
		
		//3.重写向页面到confirm.jsp
		response.sendRedirect(request.getContextPath()+"/bookshoping/confirm.jsp");
	}

}
