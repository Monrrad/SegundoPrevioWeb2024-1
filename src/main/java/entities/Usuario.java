package entities;

import jakarta.persistence.*;
import lombok.Data;

    @Data
    @Entity
    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String username;
}
