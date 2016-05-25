package game.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dadler
 */

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
