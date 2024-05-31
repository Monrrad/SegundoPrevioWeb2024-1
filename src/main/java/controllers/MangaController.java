package controllers;

import entities.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.MangaService;

import java.util.List;

@RestController
@RequestMapping("/mangas")
public class MangaController {
    @Autowired
    private MangaService mangaService;

    @GetMapping
    public List<Manga> getAllMangas() {
        return mangaService.getAllMangas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manga> getMangaById(@PathVariable Integer id) {
        Manga manga = mangaService.getMangaById(id);
        if (manga == null) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok(manga);
    }

    @PostMapping
    public Manga createManga(@RequestBody Manga manga) {
        return mangaService.createManga(manga);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manga> updateManga(@PathVariable Integer id, @RequestBody Manga manga) {
        Manga updatedManga = mangaService.updateManga(id, manga);
        if (updatedManga == null) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok(updatedManga);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteManga(@PathVariable Integer id) {
        mangaService.deleteManga(id);
        return ResponseEntity.ok("Manga deleted successfully");
    }
}