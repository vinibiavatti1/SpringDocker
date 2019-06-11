package br.com.furb.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

	public MainController() {}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String get() {
		return "Hello World!";
    }
	
}
