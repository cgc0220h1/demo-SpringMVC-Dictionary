package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.Translator;

@Controller
public class HomeController {
    @Autowired
    private Translator translator;

    private ModelAndView modelAndView = new ModelAndView("home");

    @GetMapping("/home")
    public ModelAndView showView() {
        return modelAndView;
    }

    @PostMapping("/home")
    public ModelAndView translate(@RequestParam String input) {
        String result;
        if (translator.translateToVN(input) == null) {
            result = "No result!";
        } else {
            result = translator.translateToVN(input);
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
