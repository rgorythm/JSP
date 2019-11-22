package lat.lat;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Inject
	LastService service;
	@Resource(name="PageMaker")
	PageMaker pageMaker;
	@Resource(name="SearchKeyword")
	SearchKeyword searchKeyword;
	
	@GetMapping(value="/boardList")
		public String boardList(Model model,
								@RequestParam(required=false, defaultValue="boardSubject")String searchType,
								@RequestParam(required=false)String keyword) {
			searchKeyword.setKeyword(keyword);
			searchKeyword.setSearchType(searchType);
			List<BoardVO> boardList = service.boardList(searchKeyword);
			pageMaker.setPageInfo(searchKeyword);
			pageMaker.setTotalCount(service.boardCountList());
			model.addAttribute("boardList", boardList);
			model.addAttribute("pageMaker", pageMaker);
			return "boardList";
		}
}
