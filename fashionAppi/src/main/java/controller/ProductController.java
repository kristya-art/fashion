package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author kristina.salini
 *
 */

@Controller
public class ProductController {
	

	@RequestMapping(value = "/helloWorld", method=RequestMethod.GET)
		public String hello(Model m) {
			m.addAttribute("mail", "hello world!");
			return "helloWorld";
	}
	

	@GetMapping("/welcome")
	public String Welcome(Model m) {
		m.addAttribute("message", "YoU aRe WeLcOmE to the FASHION SHOW *****");
		return "welcome";
	}

	@GetMapping("/productList")
	public String GetProductList() {
	    
		return "productList";
	}
	
	@GetMapping("/formTest")
	public String getFormTestView() {
		return "formTest";
	}
	
}
