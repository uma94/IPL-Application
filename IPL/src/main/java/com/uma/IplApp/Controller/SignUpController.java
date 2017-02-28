package com.uma.IplApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uma.IplApp.Model.User;
import com.uma.IplApp.Service.UserService;
@Controller
public class SignUpController {
	@Autowired
	private UserService userService;

    //private Mail mail;
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "signup";
	}

	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user, BindingResult result,Model model) {

		userService.addUser(user);
		/*String senderEmail="shankar.uma35@gmail.com";
		String receiverEmail=user.getEmail();*/
		//mail.sendMail(senderEmail, receiverEmail,"IPL2016_Registration_Confirmation[no_reply]","Hi, \n this is an auto generated IPL registration E-mail confirmation,Thank you!!!");
		model.addAttribute("Message","Your data successfully saved and confiramtion mail sent to your registred E-mail.");
		return "signin";
	}
}
