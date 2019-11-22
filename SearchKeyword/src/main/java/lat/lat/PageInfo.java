package lat.lat;

import org.springframework.stereotype.Component;

@Component("PageInfo")
public class PageInfo {

		int page;
		int perPageNum;
		int startRow;
		
		public PageInfo() {
			this.page = 1;
			this.perPageNum= 9;
		}

		public void setPage(int page) {
			if(page<=0)
				page = 1;
			else
				this.page = page;
		}
		
		public int getPage() {
			return page;
		}

		public void setPerPageNum(int perPageNum) {
			this.perPageNum=perPageNum;
		}
		
		public int getPerPageNum() {
			return this.perPageNum;
		}

		public int getStartRow() {
			startRow = (page-1)*perPageNum;
			return startRow;
		}

		@Override
		public String toString() {
			return "PageInfo [page=" + page + ", perPageNum=" + perPageNum + ", startRow=" + startRow + "]";
		}

}
