package day0512;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.���� ���� Ŭ������ �� ���񽺰� �Ǿ���ϱ� ������ HttpServlet�� ��ӹ޴´�
@SuppressWarnings("serial")
public class Hello extends HttpServlet {
	//2.Ŭ���̾�Ʈ�� ��û�ϴ� ����� ó���� �� �ִ� method�� Override�Ѵ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3.�����ڿ��� �������� ������ ������ �� �ֵ��� �����Ѵ�.(MME-Type�� ����)
		response.setContentType("text/html;charset=UTF-8");
		//4.�������� ������ �����ڿ��� ���� �� �ֵ��� �����ڿ��� ����� �� �ִ� ��Ʈ���� ��´�
		PrintWriter out=response.getWriter();
		//5.�����ڿ��� ������ ������ ��Ʈ���� �ۼ�
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>�ȳ� Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>�ȳ��ϼ���?</strong><br/>");
		out.println("������ 20210512<br/>");
		out.println("</body>");
		out.println("</html>");
		
	}//doGet

}//class
