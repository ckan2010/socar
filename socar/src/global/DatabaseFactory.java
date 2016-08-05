package global;

public class DatabaseFactory {
	public static Database createDatabase(Vendor vendor, String id, String pw) {
		String driver = "", url = "";

		switch (vendor) {
		case ORACLE:
			driver = Constants.ORACLE_DRIVER;
			url = Constants.ORACLE_URL;
			break;

		default:
			break;
		}
		
		return new Database(driver, url, id, pw);
	}
}