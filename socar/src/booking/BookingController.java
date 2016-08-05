package booking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.Seperator;
import javafx.scene.control.Separator;
import member.MemberBean;

@WebServlet("/booking.do")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("BookingController 진입");
		HttpSession session = request.getSession();
		Seperator.init(request, response);
		BookingService service = BookingServiceImpl.getInstance();
		BookingBean booking = new BookingBean();
		
		switch (Seperator.command.getAction()) {
		case "move":
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "resv": //예약버튼 눌렀을때 로그인 안 된상태면 로그인창으로 보낼꺼임
			MemberBean member = (MemberBean) session.getAttribute("user");
			if(member==null){
				Seperator.command.setDirectory("member");
				Seperator.command.setPage("login");
			}
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		case "reserve":
			// page = home
			if(service.reserve(Integer.parseInt(request.getParameter("carseq")), Integer.parseInt(request.getParameter("renttime")))==1){
				// history 예약 성공
				Seperator.command.setDirectory("home");
			}else{
				// 실패
				Seperator.command.setPage("booking");
			}
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			 /*Integer.parseInt(request.getParameter("seq"));
			int rentTime = Integer.parseInt(request.getParameter("rentTime"));*/
			
			break;
		default:
			break;
		}
		
		
	}

}

