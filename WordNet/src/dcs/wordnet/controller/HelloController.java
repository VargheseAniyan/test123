package dcs.wordnet.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dcs.wordnet.service.MongoService;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class HelloController {
 
	@RequestMapping("/welcome.do")
	public ModelAndView helloWorld() {
 
		String message =new MongoService().setup();
		return new ModelAndView("welcome", "message", message);
	}
}