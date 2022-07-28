package com.testSpring.apiTest.security.jwt;

import org.slf4j.Logger;
import com.testSpring.apiTest.models.Usuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION = 24 * 60 * 60 * 1000;
    @Value("${app.jwt.secret}")
    private String secretKey;

    public String generateAccessToken(Usuario usuario) {
        return Jwts.builder()
                .setSubject(usuario.getId() + "," + usuario.getEmail())
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }

    public boolean validateAccesToken(String token) {
        try {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;

        } catch (ExpiredJwtException ex) {
            LOGGER.error("JWT expired", ex);
        } catch (IllegalArgumentException ex) {
            LOGGER.error("Token is null, empty or has whitespaces", ex);
        } catch (MalformedJwtException ex) {
            LOGGER.error("Invalid JWT token", ex);
        } catch (UnsupportedJwtException ex) {
            LOGGER.error("Unsupported JWT token", ex);
        } catch (SignatureException ex) {
            LOGGER.error("Invalid JWT signature", ex);
        }
        return false;

    }

    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    private Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}
