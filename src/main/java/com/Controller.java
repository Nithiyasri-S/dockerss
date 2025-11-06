package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController				// it is used to handle request and response of API ==>@Controller + @ResponseBody
public class Controller {
	@GetMapping(value = "/get") // /get==> is a endPoint
	public String get() {
		return "Saikumar";
	}
}