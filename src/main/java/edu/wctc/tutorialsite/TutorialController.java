package edu.wctc.tutorialsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialController {

    @RequestMapping("/")
    public String showHome() {
        return "/index";
    }

    @RequestMapping("/step1")
    public String showStep1() {
        return "/step1";
    }

    @RequestMapping("/step2")
    public String showStep2() {
        return "/step2";
    }

    @RequestMapping("/step3")
    public String showStep3() {
        return "/step3";
    }
}
