package spring.cham.test.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.cham.test.model.FileT;
import spring.cham.test.service.FileTService;

@Controller
public class MyBoardController {
	@Inject 	// 사용할 service inject
	FileTService service;

	@RequestMapping(value="/")
	public ModelAndView main() throws Exception {
		System.out.println("들어옴");
		// 데이터와 뷰를 동시에 설정이 가능
	    ModelAndView mv = new ModelAndView();
	    List<FileT> list = service.selectService();
	    
	    mv.setViewName("/myBoard"); // 뷰의 이름
	    mv.addObject("list", list); // 뷰로 보낼 데이터 값
	    return mv;
	}
}
