package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeCtl {

	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("name","prashant jha");
		model.addAttribute("id",1234);
		
		List<String> friend=new ArrayList<String>();
	      friend.add("saurabh");
	      friend.add("kartik");
	      friend.add("basant");
	      
	      model.addAttribute("f",friend);
	      
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");

		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","arun");
		modelAndView.addObject("id",3456);
		
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<String>list= new ArrayList<String>();
		list.add("12");
		list.add("13");
		list.add("14");
		list.add("15");
		
		modelAndView.addObject("l",list);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}

