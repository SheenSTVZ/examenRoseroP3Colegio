package ec.edu.espe.examen.colegio.resource;

import ec.edu.espe.examen.colegio.model.Estudiante;
import ec.edu.espe.examen.colegio.service.NivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nivel")
@RequiredArgsConstructor
public class NivelResource {

    private final NivelService nivelService;

    @GetMapping("/{nivel}")
    public ResponseEntity<List<Estudiante>> obtenerEstudiantesPorNivel(@PathVariable Integer nivel) {
        List<Estudiante> estudiantes = nivelService.obtenerEstudiantesPorNivel(nivel);
        return ResponseEntity.ok(estudiantes);
    }

}
