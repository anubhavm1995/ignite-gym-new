package heroku_demo.controller;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@GetMapping(path = "/")
	public String enter() {
		return "Hello World - start";
	}
	@GetMapping(path = "/test")
	public String helloWorld() {
		return "Hello World - only test";
	}

	@GetMapping(path = "/test1")
	public HashMap<Integer,String> helloWorldBean() {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Anubhav");
		map.put(3, "AJAY");
		map.put(2, "Aman");
		
		return map;
	}

	@GetMapping(path = "/test/{name}")
	public String helloWorldPathVariable(@PathVariable String name) {
		return ("Hi "+name);
	}
}
