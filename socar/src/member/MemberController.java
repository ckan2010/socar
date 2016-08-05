package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.Seperator;
import history.HistoryService;
import history.HistoryServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberController 진입");
		HttpSession session = request.getSession();
		Seperator.init(request, response);
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		MemberBean memSession = new MemberBean();
		
		switch (Seperator.command.getAction()) {
		case "move":
			String chk = request.getParameter("chk");
			if(chk!=null){
				member = (MemberBean) session.getAttribute("user");
				if(member!=null){
					Seperator.command.setPage("update");
				}else{
					Seperator.command.setPage("login");
				}
				Seperator.command.setView();
			}
			DispatcherServlet.send(request, response, Seperator.command);
			break;

		case "regist":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			member.setName(request.getParameter("name"));
			member.setPhone(request.getParameter("phone"));
			member.setBirth(request.getParameter("ssn"));
			member.setGender(request.getParameter("gender"));
			member.setJob(request.getParameter("job"));
			member.setRegion(request.getParameter("region"));
			member.setAddress(request.getParameter("address"));
			member.setLicenceVal(request.getParameter("licence_val"));
			member.setLicenceLocal(request.getParameter("licence_local"));
			member.setLicenceNum(request.getParameter("licence_num"));
			member.setLicenceEnd(
					request.getParameter("lic_end_year") + "-"
					+ request.getParameter("lic_end_mon") + "-" 
					+ request.getParameter("lic_end_day"));
			member.setLicenceStart(
					request.getParameter("lic_start_year") + "-" 
					+request.getParameter("lic_start_mon") + "-"
					+request.getParameter("lic_start_day"));
			
			if(service.regist(member).equals("fail")){
				System.out.println("컨트롤러 : 회원가입 실패");
				Seperator.command.setDirectory(request.getParameter("directory"));
				Seperator.command.setPage("regist");
				Seperator.command.setView();
			} else {
				System.out.println("컨트롤러 : 회원가입 성공");
				Seperator.command.setDirectory(request.getParameter("directory"));
				Seperator.command.setPage(request.getParameter("page"));
				Seperator.command.setView();
			}
			DispatcherServlet.send(request, response, Seperator.command);
			break;
			
		case "login":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			memSession = service.login(member);
			
			if(memSession.getId().equals("fail")){
				System.out.println("컨트롤러 : 로그인 실패");
				Seperator.command.setPage("login");
				Seperator.command.setView();
			} else {
				System.out.println("컨트롤러 : 로그인 성공");
				request.setAttribute("user", memSession);
				session.setAttribute("user", memSession);
				System.out.println("로그인 세션 정보 : " + memSession);
				Seperator.command.setDirectory("home");
				Seperator.command.setPage("main");
				Seperator.command.setView(); 
			}
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		
		case "logout":
			session.invalidate();
			Seperator.command.setDirectory("home");
			Seperator.command.setPage("main");
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			break;
		
		case "update":
			
			member = (MemberBean) session.getAttribute("user");
			
				member.setPw(request.getParameter("pw"));
				member.setPhone(request.getParameter("phone"));
				member.setAddress(request.getParameter("address"));
				member.setRegion(request.getParameter("region"));
				member.setLicenceVal(request.getParameter("licence_val"));
				member.setLicenceLocal(request.getParameter("licence_local"));
				member.setLicenceNum(request.getParameter("licence_num"));
				member.setLicenceEnd(
						request.getParameter("lic_end_year") + "-"
						+ request.getParameter("lic_end_mon") + "-" 
						+ request.getParameter("lic_end_day"));
				member.setLicenceStart(
						request.getParameter("lic_start_year") + "-" 
						+request.getParameter("lic_start_mon") + "-"
						+request.getParameter("lic_start_day"));
				service.updateInfo(member);
			/*	Seperator.command.setDirectory("member");*/
				Seperator.command.setPage("update");
			Seperator.command.setView();
			DispatcherServlet.send(request, response, Seperator.command);
			break;
			
		case "delete":
			member = (MemberBean) session.getAttribute("user");
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			if(service.leave(member).equals("fail")){
				Seperator.command.setDirectory("member");
				Seperator.command.setPage("delete");
				Seperator.command.setView();
			} else {
				session.invalidate();
				Seperator.command.setDirectory("home");
				Seperator.command.setPage("main");
				Seperator.command.setView();
			}
			DispatcherServlet.send(request, response, Seperator.command);
			break;
			
		case "history":
			HistoryService hService = HistoryServiceImpl.getInstance();
			request.setAttribute("list", hService.list());
			DispatcherServlet.send(request, response, Seperator.command);
			break;
			
		default:
			break;
		}
	}
}
