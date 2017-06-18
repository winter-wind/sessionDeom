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
		//1.��ȡ���������name,address, cardType,card
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String cardType = request.getParameter("cardType");
		String card = request.getParameter("card");
		//�����ȡ�����з�װ
		Customer customer = new Customer(name,address, cardType,card);
		
		//2.��������Ϣ���뵽HttpSession��
		HttpSession session = request.getSession();
		session.setAttribute("customer", customer);
		
		//3.��д��ҳ�浽confirm.jsp
		response.sendRedirect(request.getContextPath()+"/bookshoping/confirm.jsp");
	}

}
