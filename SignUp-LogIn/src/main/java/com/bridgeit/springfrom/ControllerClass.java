package com.bridgeit.springfrom;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass {
	@Autowired
	Dao daouser;
	
  @RequestMapping("/login")
	public String logIn(Model m,@ModelAttribute("user")User user) {
  List<User> list=daouser.getUsers();
	System.out.println(list);
	System.out.println(user.getEmail()+ " "+user.getPassword());
  for(int i=0;i<list.size();i++) {
		
  if(list.get(i).getEmail().equals(user.getEmail())&&list.get(i).getPassword().equals(user.getPassword())) {
	  
	  
	  return "home-page";}
  
  }return "error-page";
	}
  @RequestMapping("/signup")
  public String signUp() {
	  
	  
	  
	 return "sign-up";
  }
 @RequestMapping(value="/save",method=RequestMethod.POST)
 public String save(@ModelAttribute("user") User user) {
	 System.out.println(user.getEmail());
	 daouser.save(user);
	 return "index1";
 }


}
