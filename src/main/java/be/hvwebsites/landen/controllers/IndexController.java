package be.hvwebsites.landen.controllers;

import be.hvwebsites.landen.services.LandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    private final LandService service;

    public IndexController(LandService service) {
        this.service = service;
    }

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("index", "aantalLanden", service.findAantal());

    }
}
