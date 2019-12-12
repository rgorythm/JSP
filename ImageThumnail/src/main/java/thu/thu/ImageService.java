package thu.thu;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class ImageService {
	
	@Inject
	ImageDAO dao;
	
	public List<ImageVO> imageList(){
		return dao.imageList();
	}
}
