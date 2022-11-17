package com.example.appforphotographers;

import entity.Set;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ControllerMain {
    private final List<Set>settings=List.of(
            new Set ("Portrait", "800", "1/60","f/4"),
            new Set ("Sports", "800","1/80", "f7.1"),
            new Set ("Group","1600","1/800", "f2.8")
            );

    @GetMapping("/")
    public ModelAndView list(){
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("settings", settings);
        return modelAndView;
    }

}
