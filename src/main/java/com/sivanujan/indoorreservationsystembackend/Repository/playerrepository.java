package com.sivanujan.indoorreservationsystembackend.Repository;

import com.sivanujan.indoorreservationsystembackend.Model.player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface playerrepository extends JpaRepository<player, Long> {


}
