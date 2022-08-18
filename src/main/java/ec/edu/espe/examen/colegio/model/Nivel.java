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
@Document(collection = "nivel")
@TypeAlias("nivel")
public class Nivel {

    @Id
    private String id;

    @Indexed(name = "idx_nivel_nivel", unique = true)
    private Integer nivel;

    @DocumentReference
    private List<Estudiante> estudiantes;
}
