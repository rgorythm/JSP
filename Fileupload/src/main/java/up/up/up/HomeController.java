package up.up.up;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class HomeController {
	@Inject
	ServletContext sct;
	
	@RequestMapping(value ="/fileupload", method = RequestMethod.POST)
	public void upload(MultipartFile uploadfile) {
		//String path = sct.getRealPath("/upload"); 서버경로??아무튼
		
		//이아이는 로컬경로야
		String path = "C:\\Program Files\\Java\\jsp\\workspace\\Fileupload\\src\\main\\webapp\\resources";
		
		System.out.println("path는:-->"+path);
		System.out.println("파일 이름: {}" + uploadfile.getOriginalFilename());
		System.out.println("파일 크기: {}" + uploadfile.getSize());
		
		//uuid는 이름 중복 방지야
		UUID uuid = UUID.randomUUID();
		String saveName = uuid + "_" + uploadfile.getOriginalFilename();

		System.out.println("saveName: {}" + saveName);
		File saveFile = new File(path,saveName); // 저장할 폴더 이름, 저장할 파일 이름

		try {
			uploadfile.transferTo(saveFile); // uuid로 랜덤 이름 붙인  saveFile
		} catch (IOException e) {
			e.printStackTrace();
		
	}

	/*private String saveFile(MultipartFile file) {
		// 파일 이름 변경
		UUID uuid = UUID.randomUUID();
		String saveName = uuid + "_" + file.getOriginalFilename();

		System.out.println("saveName: {}" + saveName);
		// 저장할 File 객체를 생성(껍데기 파일)ㄴ
		File saveFile = new File(saveName); // 저장할 폴더 이름, 저장할 파일 이름

		try {
			file.transferTo(saveFile); // 업로드 파일에 saveFile이라는 껍데기 입힘
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return saveName;*/
	} // end saveFile(
}
