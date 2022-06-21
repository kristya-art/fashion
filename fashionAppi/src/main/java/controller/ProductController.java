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
public class ProductController {
	

	@RequestMapping("/helloWorld")
		public String hello(Model m) {
			m.addAttribute("mail", "hello world!");
			return "helloWorld";
	}
	
	
	
	
	@GetMapping("/")
	public void getAllProducts() {
		
		
	}

}
