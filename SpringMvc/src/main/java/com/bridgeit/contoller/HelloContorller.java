package com.bridgeit.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class HelloContorller {
	@RequestMapping("/")  
    public String display()  
    {  
        return "indexs";  
    }     
}
