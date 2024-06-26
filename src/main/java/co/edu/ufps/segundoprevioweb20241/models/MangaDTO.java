package co.edu.ufps.segundoprevioweb20241.models;

import lombok.Data;

import java.time.LocalDate;


    @Data
    public class MangaDTO {

        private Integer id;
        private LocalDate fechaLanzamiento;
        private Integer temporadas;
        private PaisDTO pais;
        private Integer anime;
        private Integer juego;
        private Integer pelicula;
        private TipoDTO tipo;

    }

