package com.uma.IplApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uma.IplApp.Model.User;
import com.uma.IplApp.ServiceImpl.UserServiceImpl;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("signup")
	public String userDetail(@ModelAttribute User user)
	{
		userServiceImpl.addUser(user);
		
		return "signup";
	}
	@RequestMapping("login")
	public String userData(@ModelAttribute User user)
	{
		String email=user.getEmail();
		String password=user.getPassword();
		userServiceImpl.authUser(email, password);
		
		return "login";
	}
}
