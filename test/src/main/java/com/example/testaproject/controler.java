package com.example.testaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class controler {
    @RestController
    @RequestMapping("/indoor")
    public class playercontroler {


        @GetMapping("/player")
        public String getallplayers(){
            return ("playerrepository.findAll()");
        }
    }

}
