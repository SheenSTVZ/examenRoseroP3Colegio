package ec.edu.espe.examen.colegio.service;

import ec.edu.espe.examen.colegio.dao.NivelRepository;
import ec.edu.espe.examen.colegio.model.Estudiante;
import ec.edu.espe.examen.colegio.model.Nivel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NivelService {

    private final NivelRepository nivelRepository;

    public List<Estudiante> obtenerEstudiantesPorNivel(Integer nivel) {
        Optional<Nivel> nivelOpt = this.nivelRepository.findByNivel(nivel);
        if (nivelOpt.isPresent()) {
            return nivelOpt.get().getEstudiantes();
        }
        return null;
    }
}
