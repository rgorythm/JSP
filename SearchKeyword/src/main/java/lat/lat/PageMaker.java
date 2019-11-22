package lat.lat;

import org.springframework.stereotype.Component;

@Component("PageMaker")
public class PageMaker {

	private PageInfo pageInfo;
	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private int displayPageNum = 5;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}

	private void calcData() {

		endPage = (int) (Math.ceil(pageInfo.getPage() / (double) displayPageNum) * displayPageNum);
		int tempEndPage = (int) (Math.ceil(totalCount / (double) pageInfo.getPerPageNum()));
		if (endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		startPage = (endPage - displayPageNum) + 1;
		if(startPage<0) startPage=1;


		prev = startPage == 1 ? false : true;
		next = endPage * pageInfo.getPerPageNum() >= totalCount ? false : true;

	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

}
