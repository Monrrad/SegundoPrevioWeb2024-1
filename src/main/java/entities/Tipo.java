package entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
}
