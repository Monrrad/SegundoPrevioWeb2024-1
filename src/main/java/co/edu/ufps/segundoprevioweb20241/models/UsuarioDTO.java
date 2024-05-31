package co.edu.ufps.segundoprevioweb20241.models;

import lombok.Data;


    @Data
    public class UsuarioDTO {

        private Integer id;
        private String nombre;
        private String username;
        private String email;
        private String password;

    }

