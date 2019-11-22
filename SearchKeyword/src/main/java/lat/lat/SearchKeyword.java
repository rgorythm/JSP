package lat.lat;

import org.springframework.stereotype.Component;

@Component("SearchKeyword")
public class SearchKeyword extends PageInfo{
	
	String searchType;
	String keyword;
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
