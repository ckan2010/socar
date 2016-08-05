package global;

import java.util.List;

public interface CommonService {
	public List<?> list(); 
	public List<?> findBy(String keyword);
}