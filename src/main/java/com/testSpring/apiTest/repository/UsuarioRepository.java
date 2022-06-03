
package com.testSpring.apiTest.repository;

import com.testSpring.apiTest.models.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository <Usuario, Integer>   {
    Optional<Usuario>findByEmail (String email);
}
