package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import model.Artikel;
@Controller
public class StatistikController {
	
	
	@RequestMapping(value="/artikel", method=RequestMethod.GET)
	public ModelAndView artikel() {
		 
		List<String> formats = this.getFormat();
		
		Artikel artikel = new Artikel();
		artikel.setArtId("3");
		artikel.setArtnr("33");
		
		Artikel artikel2 = new Artikel();
		artikel2.setArtId("4");
		artikel2.setArtnr("44");
		
		List<Artikel> list = new ArrayList<>();
		list.add(artikel2);
		list.add(artikel);
		
		
		ModelAndView mav = new ModelAndView("artikel", "command",artikel);
		mav.addObject("list",list);
		mav.addObject("formats",formats);
		return mav;
	}
 
	@RequestMapping(value="/addArtikel", method= RequestMethod.POST)
	public String addArtikel(@ModelAttribute("artikel") 
			Artikel artikel, ModelMap model) {
		
		model.addAttribute("artId",artikel.getArtId());
		model.addAttribute("artnr",artikel.getArtnr());
				
		return "artikel";
		
		
	}
	
	@ModelAttribute("formats")
	public  List<String> getFormat(){
		List<String> formats = new ArrayList<>();
		formats.add("XML");
		formats.add("XLSX");
		formats.add("CSV");
		
		return formats;
	}
	
	
	
	
}
