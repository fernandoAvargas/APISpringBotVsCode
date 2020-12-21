package com.fernando.fernandospringvscode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping(value="/")
    public String getMethodName() {
        return "<div style='width: 100vw;'><div style='text-align:center;color:blue;align-items: center;display: flex;flex-direction: row;flex-wrap: wrap;justify-content: center;'><h2>Olá Mundo!...(Spring Bot no VSCode)<h2></div></div>";
    }    
    
}





