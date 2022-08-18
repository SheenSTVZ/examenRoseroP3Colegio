package ec.edu.espe.examen.colegio.service;

import ec.edu.espe.examen.colegio.dao.EstudianteRepository;
import ec.edu.espe.examen.colegio.dao.ParaleloRepository;
import ec.edu.espe.examen.colegio.model.Estudiante;
import ec.edu.espe.examen.colegio.model.Paralelo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ParaleloService {

    private final ParaleloRepository paraleloRepository;

    private final EstudianteRepository estudianteRepository;

    public void asignarEstudiante(String cedula, Integer nivel){
        String[] clases = {"A", "B", "C"};
        Random random = new Random();
        int index = random.nextInt(clases.length);
        String clase = clases[index];
        Paralelo paraleloSeleccionado = this.paraleloRepository.findByNombreAndNivel(clase, nivel);
        Optional<Estudiante> estudiante = this.estudianteRepository.findById(cedula);
        if (estudiante.isPresent()) {
            paraleloSeleccionado.getEstudiantes().add(estudiante.get());
            this.paraleloRepository.save(paraleloSeleccionado);
            System.out.println("El estudiante se ha asignado a la clase " + clase);
        }else{
            System.out.println("El estudiante no existe");
        }
    }

    public List<Estudiante> obtenerEstudiantesPorParalelo(Integer nivel, String nombre){
        Paralelo paralelo = this.paraleloRepository.findByNombreAndNivel(nombre, nivel);
        return paralelo.getEstudiantes();
    }
}
