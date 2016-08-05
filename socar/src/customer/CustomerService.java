package customer;

import java.util.List;

import global.CommonService;

public interface CustomerService {
	public void sendQuery(CustomerBean customer);
//	public List<CustomerBean> list();
	public List<CustomerBean> findBy(String keyword);
}
 