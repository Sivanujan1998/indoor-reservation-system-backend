package com.sivanujan.indoorreservationsystembackend.Controller;

import com.sivanujan.indoorreservationsystembackend.Model.player;
import com.sivanujan.indoorreservationsystembackend.Repository.playerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class playercontroler {
    @Autowired
    private playerrepository playerrepository;

    @GetMapping("/player")
    public List<player> getplayer() {
        System.out.println("players data send");
        return playerrepository.findAll();

    }


    @PostMapping("/player")
    public player createplayer(@RequestBody player man){
        System.out.println("Registraion Successfull");
        return playerrepository.save(man);
    }
}
