package com.sivanujan.indoorreservationsystembackend.Controller;
import com.sivanujan.indoorreservationsystembackend.Model.Review;
import com.sivanujan.indoorreservationsystembackend.Repository.feedbackrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class Reviewcontroler{
    @Autowired

    private feedbackrepository feedbackrepository;

    @GetMapping("/review")
    public List<Review> getreview() {
        System.out.println("review data send");
        return feedbackrepository.findAll();

    }


    @PostMapping("/review")
    public Review createplayer(@RequestBody Review review){
        System.out.println("review added Successfull");
        return feedbackrepository.save(review);
    }
}
