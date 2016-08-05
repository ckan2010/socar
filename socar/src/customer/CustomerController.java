package customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.DispatcherServlet;
import global.Seperator;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/customer.do")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===Customer 컨트롤러 진입===");
		Seperator.init(request, response);
		CustomerService service = CustomerServiceImpl.getInstance();
		CustomerBean customer = new CustomerBean();
		
		switch (Seperator.command.getAction()) {
		case "move":
			DispatcherServlet.send(request, response, Seperator.command);
			break;

	
		case "customer":
			customer.setValue(request.getParameter("val"));
			customer.setTitle(request.getParameter("title"));
			customer.setContent(request.getParameter("content"));
			customer.setFileName(request.getParameter("file"));
			service.sendQuery(customer);
			Seperator.command.setDirectory("customer");
			Seperator.command.setPage("customer");
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			break;
			
			
			
		default:
			break;
		}
	}
}
