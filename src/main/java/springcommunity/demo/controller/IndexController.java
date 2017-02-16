package springcommunity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
       public String home(Model model){
		  String hello ="Congratulations! You're logged in successful";
		   model.addAttribute("hello", hello);
    	        return "index";
       }
	
	/*ModelAttribute dùng để pass dữ liệu từ Controller xuống view*/
	@RequestMapping(value="/login", method=RequestMethod.GET)
	   public String login(Model model){
		String message="Spring Community";
		String title="Demo check login";
		   model.addAttribute("message", message);
		   model.addAttribute("title", title);
	        return "login";
	}
	
	/*Sử dụng annotation RequestParam để lấy dữ liệu người dùng input vào thông qua form*/
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String checkLogin(@RequestParam(value="name") String name, @RequestParam(value="pass") String pass){
		return (name.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) ? "redirect:" : "redirect:login";
	}

}
