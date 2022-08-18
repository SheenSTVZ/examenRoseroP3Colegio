package ec.edu.espe.examen.colegio.dao;

import ec.edu.espe.examen.colegio.model.Paralelo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParaleloRepository extends MongoRepository<Paralelo, String> {

    Paralelo findByNombreAndNivel(String nombre, Integer nivel);
}
