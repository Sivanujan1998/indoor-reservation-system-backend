package com.sivanujan.indoorreservationsystembackend.Controller;

import com.sivanujan.indoorreservationsystembackend.Model.badmintoncourt;
import com.sivanujan.indoorreservationsystembackend.Repository.badmintoncourtrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api")
public class badmintoncourtcontroler {
    @Autowired
    private badmintoncourtrepository badmintoncourtrepository;
    @GetMapping("/badminton")
    public List<badmintoncourt> getbadmintoncourt() {
        System.out.println("court data send");
        return badmintoncourtrepository.findAll();

    }


    @PostMapping("/badminton")
    public badmintoncourt bookthebadmintoncourt(@RequestBody badmintoncourt badmintoncourt){
        System.out.println("court booked Successfull");
        return badmintoncourtrepository.save(badmintoncourt);
    }

}


