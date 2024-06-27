package com.jd.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {

    @ResponseBody
    @GetMapping
    public String mostrarMensaje3(){
        return "Hola mundo por defecto";
    }

    @GetMapping("/holamundo1")
    public String mostrarMensaje1(){
        return "Hola mundo en Spring Boot 1";
    }

    @GetMapping("/holamundo2")
    public String mostrarMensaje2(){
        return "Hola mundo en Spring Boot 2";
    }
}
