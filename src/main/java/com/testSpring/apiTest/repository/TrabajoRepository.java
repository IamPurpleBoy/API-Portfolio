
package com.testSpring.apiTest.repository;

import com.testSpring.apiTest.models.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo, Long>{
    
}
