package dev.danhorris.sociallogin.controllers;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello Home";
    }

    
    @GetMapping("/secure")
    public String secure(){
        return "Hello Secured";
    }
    
}
