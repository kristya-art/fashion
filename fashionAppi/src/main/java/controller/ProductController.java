package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author kristina.salini
 *
 */

@Controller
//@RequestMapping("/products")
public class ProductController {
	

	@RequestMapping("/helloWorld")
		public String hello(Model m) {
			m.addAttribute("mail", "hello world!");
			return "helloWorld";
	}
	

	@GetMapping("/")
	public String Welcome(Model m) {
		m.addAttribute("message", "YoU aRe WeLcOmE to the FASHION SHOW *****");
		return "welcome";
	}

}
