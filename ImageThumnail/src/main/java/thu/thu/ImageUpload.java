package thu.thu;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.imgscalr.Scalr;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Component("ImageUpload")
public class ImageUpload {
	@Inject
	ImageDAO dao;
	
		public void uploadImage(HttpServletRequest request, ImageVO imageVO) throws Exception{
			System.out.println("뭐야");
			MultipartHttpServletRequest multipart = (MultipartHttpServletRequest)request;
			System.out.println("뭐야1");
			Iterator<String> filenames = multipart.getFileNames();
			System.out.println("뭐야2");
			String path = request.getServletContext().getRealPath("/image");
			System.out.println("뭐야3");
			if(filenames.hasNext()) {
				while(filenames.hasNext()) {
					System.out.println("뭐야4");
					MultipartFile file = multipart.getFile(filenames.next());
					if(file.isEmpty()) {
						System.out.println("파일이엄서용");
					}else {
						System.out.println("파일이있어용");
						String saveName = file.getOriginalFilename();
						File saveFile = new File(path,saveName);
						file.transferTo(saveFile);
						String saveNameT = thumnailImage(saveFile, saveName, request);
						imageVO.setBoardImg(saveName);
						imageVO.setBoardImgT(saveNameT);
					}
					dao.insertImage(imageVO);
				}
			}else {
				System.out.println("아놔파일없음");
			}
			
		}
		
		public String thumnailImage(File saveFile, String saveName, HttpServletRequest request) throws Exception{
			String saveNameT = "t_"+saveName;
			String path = request.getServletContext().getRealPath("/imageT");
			BufferedImage src = ImageIO.read(saveFile);
			BufferedImage imageT = Scalr.resize(src, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_TO_HEIGHT, 100);
			File saveFileT = new File(path,saveNameT);
			String formatName = saveNameT.substring(saveNameT.lastIndexOf(".")+1);
			ImageIO.write(imageT, formatName, saveFileT);
			return saveNameT;
		}
}
