package why.why.domain;

public class BoardVO {

		int boardNum;
		String boardSubject;
		String boardContent;
		
		public int getBoardNum() {
			return boardNum;
		}
		public void setBoardNum(int boardNum) {
			this.boardNum = boardNum;
		}
		public String getBoardSubject() {
			return boardSubject;
		}
		public void setBoardSubject(String boardSubject) {
			this.boardSubject = boardSubject;
		}
		public String getBoardContent() {
			return boardContent;
		}
		public void setBoardContent(String boardContent) {
			this.boardContent = boardContent;
		}
		
		@Override
		public String toString() {
			return "BoardVO [boardNum=" + boardNum + ", boardSubject=" + boardSubject + ", boardContent=" + boardContent
					+ "]";
		}
		
		
}
