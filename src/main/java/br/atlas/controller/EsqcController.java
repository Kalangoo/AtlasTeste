package br.atlas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EsqcController {

    @GetMapping
    public String esqc(){
        return "/home/esqc";
    }
}
