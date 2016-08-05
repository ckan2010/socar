package history;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.Seperator;
import sun.rmi.server.Dispatcher;

@WebServlet("/history.do")
public class HistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public HistoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HistoryController 진입");
		HttpSession session = request.getSession();
		Seperator.init(request, response);
		HistoryService service = HistoryServiceImpl.getInstance();
		HistoryBean history = new HistoryBean();
		
		
		switch (Seperator.command.getAction()) {
		case "move":
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "history":
			DispatcherServlet.send(request, response, Seperator.command);
			
			
			break;
		default:
			break;
		}
		
		
		
		
	}


}