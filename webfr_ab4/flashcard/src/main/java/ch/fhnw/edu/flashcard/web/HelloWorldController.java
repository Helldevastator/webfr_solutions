package ch.fhnw.edu.flashcard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@ResponseBody
	@RequestMapping(value="/say/{to}/{from}")
	public String sayHello(@PathVariable("to") String to , @PathVariable("from") String from, @RequestParam(value="lang",required=false) String lang){
		if (lang != null){
			return " Hallo " + to + "from " + from;	
		}else{
			return " Hello " + to + "from " + from;
		}
		
	}
	
}
