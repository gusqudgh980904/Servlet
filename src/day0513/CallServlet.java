package day0513;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//1.HttpServlet���:�Ϲ� Ŭ������ �� ���񽺸� �ϱ� ���ؼ�
public class CallServlet extends HttpServlet {

	//2.�����ڰ� ��û�� ������� ó���� �� �ִ� method�� Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3.�����ļ���:�����ڿ��� ������ �������� ����
		response.setContentType("text/html;charset=UTF-8");
		//4.������ ���Ͽ� �����ڿ��� ������ ������ �������� ��Ʈ�� ���
		PrintWriter out=response.getWriter();
		//5.�����ڿ��� ������ ������ ��Ʈ���� ���
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>GET����� ��û�� ���� �� ����</title>");
		out.println("</head>");
		out.println("<body>");
		out.print("<strong style='background-color:#FF0000'>");
		out.print(request.getMethod());
		out.println("</strong>GET����� ��û���� ���� ����<br/>");
		out.println("<a href='javascript:history.back();'>�ڷ�</a>");
		
		
		
		out.println("</body>");
		out.println("</html>");
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3.�����ļ���:�����ڿ��� ������ �������� ����
				response.setContentType("text/html;charset=UTF-8");
				//4.������ ���Ͽ� �����ڿ��� ������ ������ �������� ��Ʈ�� ���
				PrintWriter out=response.getWriter();
				//5.�����ڿ��� ������ ������ ��Ʈ���� ���
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset='UTF-8'>");
				out.println("<title>GET����� ��û�� ���� �� ����</title>");
				out.println("</head>");
				out.println("<body>");
				out.print("<strong style='background-color:#FF0000'>");
				out.print(request.getMethod());
				out.println("</strong>POST����� ��û���� ���� ����<br/>");
				out.println("<a href='http://localhost/servlet_prj/day0513/call_servlet.html'>�ڷ�</a>");
				
				
				
				out.println("</body>");
				out.println("</html>");
	}//doPost

}//class
