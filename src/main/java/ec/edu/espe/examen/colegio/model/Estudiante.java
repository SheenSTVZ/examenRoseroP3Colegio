package ec.edu.espe.examen.colegio.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "estudiante" )
@TypeAlias("estudiante")
public class Estudiante {
    @Id
    private String id;

    @Indexed(name = "idx_estudiante_internalId", unique = true)
    private String internalId;

    @Indexed(name = "idx_estudiante_cedula", unique = true)
    private String cedula;

    private String nombre;

    private String apellido;

    private Integer nivel;
}
