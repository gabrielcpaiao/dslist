package com.trainingDevSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingDevSuperior.dslist.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
