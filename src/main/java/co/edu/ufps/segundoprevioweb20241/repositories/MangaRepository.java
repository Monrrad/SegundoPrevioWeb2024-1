package co.edu.ufps.segundoprevioweb20241.repositories;

import co.edu.ufps.segundoprevioweb20241.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<Manga, Integer> {
}
