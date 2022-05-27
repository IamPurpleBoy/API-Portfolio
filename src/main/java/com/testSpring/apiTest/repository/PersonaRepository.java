/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testSpring.apiTest.repository;

import com.testSpring.apiTest.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nicolas
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
        
}
