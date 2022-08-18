package ec.edu.espe.examen.colegio.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Builder
@Document(collection = "paralelo")
@TypeAlias("paralelo")
public class Paralelo {

    @Id
    private String id;

    private Integer nivel;

    private String nombre;

    private String descripcion;

    @DocumentReference
    private List<Estudiante> estudiantes;

}
