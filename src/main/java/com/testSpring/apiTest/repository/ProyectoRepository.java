
package com.testSpring.apiTest.repository;

import com.testSpring.apiTest.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository  extends JpaRepository<Proyecto, Long>{
    
}
