package com.mmtspl;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(HttpServletRequest req,Model m)
	{
		//read the provided form data
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(pass.equals("admin"))
		{
			String msg="Hello "+ name;
			//add a message to the model
			m.addAttribute("message", msg);
			return "viewpage";
		}
		else
		{
			String msg="Sorry "+ name+". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}	
	}
}
