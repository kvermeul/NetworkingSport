package ns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/sample")
public class SampleController {
	
	
	@RequestMapping(value="/getHello", method = RequestMethod.GET)
	@ResponseBody
	public String getTest(){
		System.out.println("Rest Successful");		
		return "Rest Request Test";
	}
	
}
