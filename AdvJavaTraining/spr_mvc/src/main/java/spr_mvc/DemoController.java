package spr_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/hello")
	public String nav()
	{
		System.out.println("I am in demoController");
		return "welcome";
		
	}
}
