package co.edu.ufps.segundoprevioweb20241.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private Integer temporadas;
    private Integer anime;
    private Integer juego;
    private Integer pelicula;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;



}