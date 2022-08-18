package ec.edu.espe.examen.colegio.resource;

import ec.edu.espe.examen.colegio.exception.EstudianteRepetido;
import ec.edu.espe.examen.colegio.model.Estudiante;
import ec.edu.espe.examen.colegio.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
@RequiredArgsConstructor
public class EstudianteResource {

    private final EstudianteService estudianteService;

    @PostMapping("/crear")
    public void crearEstudiante(Estudiante estudiante) throws EstudianteRepetido {
        estudianteService.crearEstudiante(estudiante);
    }

}
