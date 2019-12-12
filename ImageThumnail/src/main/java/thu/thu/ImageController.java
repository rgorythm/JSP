package thu.thu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class ImageController {
		@Resource(name="ImageUpload")
		ImageUpload upload;
		@Inject
		ImageService service;
		
		@GetMapping(value="/uploadForm")
		public String uploadForm() {
			return "uploadForm";
		}
		
		@PostMapping(value="/imageUpload")
		public String fileUpload(HttpServletRequest request, ImageVO imageVO) throws Exception {
			upload.uploadImage(request, imageVO);
			return "redirect:/";
		}
		
		@GetMapping(value="/imageList")
		public String imageList(Model model) {
			System.out.println("오지않니");
			List<ImageVO> imageList = service.imageList();
			model.addAttribute("ImageList", imageList);
			return "imageList";
		}
}
