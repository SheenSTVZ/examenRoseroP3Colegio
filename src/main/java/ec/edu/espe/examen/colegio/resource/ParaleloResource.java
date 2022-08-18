package ec.edu.espe.examen.colegio.resource;

import ec.edu.espe.examen.colegio.model.Estudiante;
import ec.edu.espe.examen.colegio.service.ParaleloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paralelo")
@RequiredArgsConstructor
public class ParaleloResource {

    private final ParaleloService paraleloService;

    @RequestMapping("asignar/{cedula}/{nivel}")
    public ResponseEntity<String> asignarParalelo(@PathVariable String cedula, @PathVariable Integer nivel) {
        try {
            this.paraleloService.asignarEstudiante(cedula, nivel);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{nivel}/{paralelo}")
    public ResponseEntity<List<Estudiante>> obtenerEstudiantesPorParalelo(@PathVariable String paralelo, @PathVariable Integer nivel) {
        List<Estudiante> estudiantes = this.paraleloService.obtenerEstudiantesPorParalelo(nivel, paralelo);
        return ResponseEntity.ok(estudiantes);
    }

}
