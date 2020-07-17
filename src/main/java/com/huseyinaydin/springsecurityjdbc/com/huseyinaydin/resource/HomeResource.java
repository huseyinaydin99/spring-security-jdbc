package com.huseyinaydin.springsecurityjdbc.com.huseyinaydin.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping(path = "/")
    public String home(){
        return "<h1>Hoş geldiniz</h1>";
    }
    @GetMapping(path = "/user")
    public String user(){
        return "<h1>Hoş geldiniz sayın kullanıcı</h1>";
    }
    @GetMapping(path = "/admin")
    public String admin(){
        return "<h1>Hoş geldiniz sayın admin</h1>";
    }

}
