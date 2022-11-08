package com.api.thirdService.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/thirdservice")
public class ThirdServiceController {

	@GetMapping("/message")
	public String test() {
		return "thirdservice conected";
	}
}
