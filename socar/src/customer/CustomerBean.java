package customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerBean {
	private String search, regDate, value, title, content, fileName;
	private int titleNum;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getRegDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
	}
	
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public void setRegDate() {
		this.regDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getTitleNum() {
		return titleNum;
	}

	public void setTitleNum(int titleNum) {
		this.titleNum = titleNum;
	}

}