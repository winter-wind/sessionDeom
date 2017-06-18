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
		//1.��ȡѡ�е�ͼ����Ϣ
		String [] books = request.getParameterValues("book");//������һ�����ݣ���getParameter��һ������
		//2.��ͼ����Ϣ���뵽HttpSession��
		request.getSession().setAttribute("books", books);
		//3.��д��ҳ�浽bookshoping/step-2.jsp
		response.sendRedirect(request.getContextPath()+"/bookshoping/step-2.jsp");//��ȡ����·��
	}

}
