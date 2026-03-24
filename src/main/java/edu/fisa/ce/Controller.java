package edu.fisa.ce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("ce4")
	public String getData() {
		System.out.println("요청 및 응답 --------------");
		return "data";
		
		
	}

}
