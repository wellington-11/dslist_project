package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Game, Long> { //Game = da class e o Long = o tipo do id

}
