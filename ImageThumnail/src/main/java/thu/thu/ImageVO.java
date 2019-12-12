package thu.thu;

import org.springframework.stereotype.Component;

@Component("ImageVO")
public class ImageVO {

		String boardImg;
		String boardImgT;
		
		public String getBoardImg() {
			return boardImg;
		}
		public void setBoardImg(String boardImg) {
			this.boardImg = boardImg;
		}
		public String getBoardImgT() {
			return boardImgT;
		}
		public void setBoardImgT(String boardImgT) {
			this.boardImgT = boardImgT;
		}
		
}
