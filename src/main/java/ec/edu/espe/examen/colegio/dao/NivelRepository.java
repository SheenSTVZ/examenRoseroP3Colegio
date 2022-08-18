package ec.edu.espe.examen.colegio.dao;

import ec.edu.espe.examen.colegio.model.Nivel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NivelRepository extends MongoRepository<Nivel, String> {
    Optional<Nivel> findByNivel(Integer nivel);
}

