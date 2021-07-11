package com.sivanujan.indoorreservationsystembackend.Repository;

import com.sivanujan.indoorreservationsystembackend.Model.badmintoncourt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface badmintoncourtrepository extends JpaRepository<badmintoncourt, Long> {


}
