package repositories;

import entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository extends JpaRepository<Manga, Integer> {
}