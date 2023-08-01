package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.UserData;
import springmvc.service.UserService;


@Controller
public class ContactCtl {

@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header", "learn code with prashant");
		m.addAttribute("desc", "home for programmer");
		System.out.println("common file creating");
	}

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("contact ctl is working");

		return "contact";
	}

	@RequestMapping(path = "/FormProcess", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute UserData user, Model model) {

		System.out.println(user);

		this.userService.createUser(user);
		System.out.println("success file get");
		return "success";

	}

//	
//	 @RequestMapping(path = "/FormProcess", method = RequestMethod.POST) public
//	 String handleForm(
//	 
//	 @RequestParam(name = "email", required=false) String useremail,
//	 
//	 @RequestParam("pwd") String pwd, Model model) {
//	 
//	 
//	 UserData user=new UserData(); 
//	 user.setEmail(useremail);
//	  user.setPwd(pwd);
//	  
//	  model.addAttribute("userData", user);
//	  
////	  String email=request.getParameter("email");
////	  System.out.println("user email is = "+email); // //
////	  System.out.println("user email=" + useremail); //
////	  System.out.println("password=" + pwd); // // model.addAttribute("email",
////	  useremail); // model.addAttribute("pwd", pwd);
//	  
//	  return "success";
//	  
//	  }

}
