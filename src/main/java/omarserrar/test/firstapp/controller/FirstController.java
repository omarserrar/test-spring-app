package omarserrar.test.firstapp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;

@RestController
@RequestMapping("/api")
public class FirstController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        try{
            String host = Inet4Address.getLocalHost().getHostName();
            return ResponseEntity.ok("Hello Im "+host);
        }
        catch (Exception e){
            return ResponseEntity.ok("Hello");
        }
    }
}
