
package com.airport.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.airport.model.domain.UserMaster;

import com.airport.service.UserService;
import com.core.exception.ServiceException;
import com.core.rest.BaseResource;

@Controller
public class UserController extends BaseResource  {
	
	 private final UserService userService;
	 @Autowired
	 public UserController(final UserService userService) {
	        this.userService = userService;
	    }

   
	 @RequestMapping(value = "/register", method=RequestMethod.GET)
	 public String index(Model model) {
	     model.addAttribute("user", new UserMaster());
	     return "register";
	 }
	 @RequestMapping(value="/register",method=RequestMethod.POST)
	 public String addUser(
			 final UserMaster user, final BindingResult bindingResult, final ModelMap model) throws ServiceException {
		 if (bindingResult.hasErrors()) {
			 return "register";

		 }
		 this.userService.register(user);
		 model.clear();
		 return "redirect:/register";
		 }
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		mav.addObject("user", new UserMaster());
		return mav;
	}

}
