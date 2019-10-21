package why.why.why;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import why.why.domain.BoardVO;
import why.why.service.BoardService;


@Controller
public class HomeController {
	@Inject
	BoardService boardService;
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(Model model) throws Exception {
		
		List<BoardVO> boardList = boardService.listAll();
		System.out.println(boardList.get(0).getBoardContent());
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	@RequestMapping(value = "/boardWriteForm" , method = RequestMethod.GET)
	public  String boardWriteForm() {
		
		
		return "boardWriteForm";
	}
	@RequestMapping(value = "/boardWrite", method = RequestMethod.POST)
	public String boardWrite(BoardVO boardVO) throws Exception {
		boardService.boardWrite(boardVO);
		
		return "redirect:/boardList";
	}
	@RequestMapping(value = "boardDetail", method = RequestMethod.GET)
	public String boardDetail(@RequestParam int boardNum , Model model) throws Exception {
		System.out.println(boardNum);
		BoardVO boardDetail = boardService.boardDetail(boardNum);
		model.addAttribute("boardDetail", boardDetail);
		return "boardDetail";
	}
	@RequestMapping(value = "boardModifyForm", method = RequestMethod.GET)
	public String boardModifyForm(@RequestParam int boardNum , Model model) throws Exception {
		System.out.println(boardNum);
		BoardVO boardDetail = boardService.boardDetail(boardNum);
		model.addAttribute("boardDetail", boardDetail);
		return "boardModifyForm";
	}
	@RequestMapping(value = "boardModify", method = RequestMethod.POST)
	public String boardModify(@RequestParam int boardNum ,BoardVO boardVO,Model model) throws Exception {
		System.out.println("보드넘"+boardVO.getBoardNum()+"");
		System.out.println("보드서브젝트"+boardVO.getBoardSubject()+"");
		System.out.println("보드컨텐트"+boardVO.getBoardContent()+"");
		boardService.boardModify(boardVO);
		BoardVO boardDetail = boardService.boardDetail(boardNum);
		model.addAttribute("boardDetail", boardDetail);
		return "boardDetail";
	}
	@RequestMapping(value = "boardDelete", method = RequestMethod.GET)
	public String boardDelete(@RequestParam int boardNum) throws Exception {
		System.out.println("딜리트보드넘:"+boardNum+"");
		boardService.boardDelete(boardNum);
		return "redirect:/boardList";
	}
}

