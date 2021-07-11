package com.sivanujan.indoorreservationsystembackend.Repository;

import com.sivanujan.indoorreservationsystembackend.Model.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface feedbackrepository extends JpaRepository<Review, Long> {
}

