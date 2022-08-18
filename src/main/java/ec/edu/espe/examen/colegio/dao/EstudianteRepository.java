package ec.edu.espe.examen.colegio.dao;

import ec.edu.espe.examen.colegio.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

    Optional<Estudiante> findByInternalId(String internalId);

    Optional<Estudiante> findByCedula(String cedula);



}

