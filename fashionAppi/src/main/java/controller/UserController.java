package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import model.User;




@Controller
public class UserController {
	
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		User user = new User();
		user.setFavoriteFrameworks(new String[]
				{"Spring MVC", "Spring Boot","Angular"});
		user.setGender("M");
		ModelAndView modelAndView = new ModelAndView("user","command",user);
		return modelAndView;
		
}
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb")User user, ModelMap model) {
		model.addAttribute("username",user.getUsername());
		model.addAttribute("password",user.getPassword());
		model.addAttribute("address",user.getAddress());
		model.addAttribute("receivePaper",user.getReceivePaper());
		model.addAttribute("favoriteFramworks",user.getFavoriteFrameworks());
		model.addAttribute("gender",user.getGender());
		model.addAttribute("country",user.getCountry());
		model.addAttribute("favoriteNumber",user.getFavoriteNumber());
		model.addAttribute("artnr",user.getArtnr());
		
		
		return "users";
		
		
	}
	
    @GetMapping("users")
    public String getUsers(Model m) {
    	m.addAttribute("users", "u r at the users page");
    	return "users";
    }
	
	
	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList(){
		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
	      webFrameworkList.add("Struts 1");
	      webFrameworkList.add("Struts 2");
	      webFrameworkList.add("Apache Wicket");
	      return webFrameworkList;
	}	
	@ModelAttribute("numbersList")
	public List<String> getNumbersList(){
		
		List<String> numbersList = new ArrayList<>();
		numbersList.add("1");
	      numbersList.add("2");
	      numbersList.add("3");
	      numbersList.add("4");
	      return numbersList;
		
	}
	
	  @ModelAttribute("countryList")
	   public Map<String, String> getCountryList() {
	      Map<String, String> countryList = new HashMap<>();
	      countryList.put("US", "United States");
	      countryList.put("CH", "China");
	      countryList.put("SG", "Singapore");
	      countryList.put("MY", "Malaysia");
	      return countryList;
	   }
	  
	}

