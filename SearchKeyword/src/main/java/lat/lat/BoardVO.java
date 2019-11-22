package lat.lat;

import org.springframework.stereotype.Component;

@Component("BoardVO")
public class BoardVO {
	
	int boardNum;
	String boardWriter;
	String boardSubject;
	String boardContent;
	String boardImg;
	String boardPass;
	int boardStat;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
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
	public String getBoardImg() {
		return boardImg;
	}
	public void setBoardImg(String boardImg) {
		this.boardImg = boardImg;
	}
	public String getBoardPass() {
		return boardPass;
	}
	public void setBoardPass(String boardPass) {
		this.boardPass = boardPass;
	}
	public int getBoardStat() {
		return boardStat;
	}
	public void setBoardStat(int boardStat) {
		this.boardStat = boardStat;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardSubject=" + boardSubject
				+ ", boardContent=" + boardContent + ", boardImg=" + boardImg + ", boardPass=" + boardPass
				+ ", boardStat=" + boardStat + "]";
	}
	
	
	
}
