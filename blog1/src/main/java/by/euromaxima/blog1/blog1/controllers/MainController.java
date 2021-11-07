package by.euromaxima.blog1.blog1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        String name = "Главная страница";
        model.addAttribute("title", name);
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title","Секретная страница))");
        return "about";

    }

}
