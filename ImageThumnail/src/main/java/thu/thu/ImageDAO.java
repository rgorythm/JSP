package thu.thu;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDAO {
	@Inject
	SqlSession sql;
	
	public List<ImageVO> imageList(){
		return sql.selectList("image.selectImageList");
	}
	
	public void insertImage(ImageVO imageVO) {
		sql.insert("image.insertImage",imageVO);
	}
}
