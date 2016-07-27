package com.microrefit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Weibo")
public class BlogController {
	
	/**微博首页**/
    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("Weibo", "actived");
        return "weibo/index";
    }
}
