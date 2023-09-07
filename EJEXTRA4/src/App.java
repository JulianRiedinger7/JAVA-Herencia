import java.util.ArrayList;
import java.util.List;

import Entities.Estudiante;
import Entities.Persona;
import Entities.PersonalServicio;
import Entities.Profesor;
import Enums.Departamento;
import Enums.EstadoCivil;
import Enums.Seccion;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Estudiante("Pablo", "Mosconi", 123, EstadoCivil.CASADO, "Frontend"));
        personas.add(new Profesor("Tadeo", "Gomez", 345, EstadoCivil.SOLTERO, 2020, 3, Departamento.SISTEMAS));
        personas.add(new PersonalServicio("Hilda", "Perez", 678, EstadoCivil.VIUDO, 2010, 5, Seccion.DECANATO));

        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }
}
