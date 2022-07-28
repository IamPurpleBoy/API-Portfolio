package com.testSpring.apiTest.repository;

import com.testSpring.apiTest.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
        
}
