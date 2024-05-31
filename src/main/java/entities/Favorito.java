package entities;

import jakarta.persistence.*;
import lombok.Data;

    @Data
    @Entity
    public class Favorito {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @ManyToOne
        @JoinColumn(name = "usuario_id")
        private Usuario usuario;

        @ManyToOne
        @JoinColumn(name = "manga_id")
        private Manga manga;
}
