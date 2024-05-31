package co.edu.ufps.segundoprevioweb20241.repositories;

import co.edu.ufps.segundoprevioweb20241.entities.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FavoritoRepository extends JpaRepository<Favorito, Integer> {
    List<Favorito> findByUsuarioUsername(String username);
}