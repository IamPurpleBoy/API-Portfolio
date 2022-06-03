
package com.testSpring.apiTest.UserRepositoryTest;

import com.testSpring.apiTest.models.Usuario;
import com.testSpring.apiTest.repository.UsuarioRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class UserRepositoryTest {
    
    @Autowired
    UsuarioRepository usuarioRepo;
    
    @Test
    public void testCreateUser(){
        
        PasswordEncoder  passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "123456";
        String encodePassword = passwordEncoder.encode(rawPassword);
        Usuario newUsuario = new Usuario ("purpleboy@purplecorp.com.ar", encodePassword);
        Usuario savedUsuario = usuarioRepo.save(newUsuario);
        assertThat(savedUsuario).isNotNull();
        assertThat(savedUsuario.getId()).isGreaterThan(0);
       
    }
    
    
}
