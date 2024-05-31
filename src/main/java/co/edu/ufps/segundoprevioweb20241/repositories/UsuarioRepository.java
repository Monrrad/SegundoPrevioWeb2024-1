package co.edu.ufps.segundoprevioweb20241.repositories;

import co.edu.ufps.segundoprevioweb20241.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByUsername(String username);
}