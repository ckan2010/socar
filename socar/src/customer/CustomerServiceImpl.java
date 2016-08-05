package customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAO dao = CustomerDAO.getInstance();
	private static CustomerService instance = new CustomerServiceImpl();
	
	public static CustomerService getInstance() {
		return instance;
	}

	private CustomerServiceImpl() {
	}
	
	@Override
	public void sendQuery(CustomerBean customer) {	//1대1 문의하기 전송
		dao.insert(customer);
	}
	
	@Override
	public List<CustomerBean> findBy(String keyword) {	//공지사항, 자주묻는 질문 검색
		// TODO Auto-generated method stub
		return null;
	} 

//	@Override
//	public List<CustomerBean> list() {	//공지사항 목록
//		return dao.list();
//	}
}