package member;

import java.util.List;

public class MemberServiceImpl implements MemberService{
	
	MemberDAO dao  = MemberDAO.getInstance();
	private MemberBean session;
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	private MemberServiceImpl() {

	}
	@Override
	public List<?> findBy(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String findID) {
		return dao.findById(findID);
	}

	@Override
	public String regist(MemberBean member) {
		String msg = "";
		MemberBean temp = this.findById(member.getId());
		if (temp == null) {
			System.out.println(member.getId()+"가 존재하지 않음, 가입 가능한 ID");
			int result = dao.insert(member);
			if (result == 1) {
				msg = "success";
			}else{
				msg = "fail";
			}
			
		}else{
			System.out.println(member.getId()+"가 존재함, 가입 불가능한 ID");
			msg = "fail";
		}
		return msg;
	}

	@Override
	public void updateInfo(MemberBean member) {
		int result = dao.update(member);
		if (result == 1) {
			System.out.println("서비스 수정결과 성공");
		}else{
			System.out.println("서비스 수정결과 실패");
		}
		
	}

	@Override
	public MemberBean login(MemberBean member) {
		MemberBean temp = new MemberBean();
		if(dao.login(member)){
			session = dao.findById(member.getId());
			temp.setId(session.getId());
			temp.setPw(session.getPw());
			temp.setName(session.getName());
			temp.setBirth(session.getGender());
			temp.setPhone(session.getPhone());
			temp.setAddress(session.getAddress());
			temp.setRegion(session.getRegion());
			temp.setJob(session.getJob());
			temp.setLicenceNum(session.getLicenceNum());
			temp.setLicenceVal(session.getLicenceVal());
			temp.setLicenceLocal(session.getLicenceLocal());
			temp.setLicenceEnd(session.getLicenceEnd());
			temp.setLicenceStart(session.getLicenceStart());
		} else {
			temp.setId("fail");
		}
		System.out.println("MemberService 로그인 결과 : " + temp.getId());
		return temp;
	}

	@Override
	public String leave(MemberBean member) {
		String result = "";
		if (dao.leave(member) == 1) {
			System.out.println("Service : DAO에서 삭제 성공");
			session = null;
		} else {
			System.out.println("Service : DAO에서 삭제 실패");
			result = "fail";
		}
		return result;
	}

	@Override
	public List<?> list() {

		return dao.list();
	}
	public MemberBean getSession() {
		System.out.println("세션확인");
		return session;
	}

}