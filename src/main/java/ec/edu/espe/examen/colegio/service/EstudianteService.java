package ec.edu.espe.examen.colegio.service;

import ec.edu.espe.examen.colegio.dao.EstudianteRepository;
import ec.edu.espe.examen.colegio.exception.EstudianteRepetido;
import ec.edu.espe.examen.colegio.model.Estudiante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public void crearEstudiante(Estudiante estudiante) throws EstudianteRepetido {
        Optional<Estudiante> estudianteOpt = this.estudianteRepository.findById(estudiante.getCedula());
        if (estudianteOpt.isPresent()) {
            throw new EstudianteRepetido("El estudiante ya existe");
        }
        this.estudianteRepository.save(estudiante);
    }
}
