package reviewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/AlreadyReviewed")
public class AlreadyReviewController {
	@GetMapping
    public String AlreadyReviewed(){
        return "AlreadyReviewed";
    }
}
