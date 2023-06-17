package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        // INSERTANDO UN NUEVO OBJETO DE TIPO PERSONA
//        Persona personaNueva = new Persona("Ivett", "Serrano", "iserrano@correo.com", "7779996633");
//        personaDao.insertar(personaNueva);

        // MODIFICAR UN REGISTRO DE PERSONA
//        Persona personaModificar = new Persona(2, "carlos", "lara", "clara@correo.com", "7221265399");
//        personaDao.actualizar(personaModificar);

        // ELIMINAR UN REGISTRO
        Persona personaDelete = new Persona(2);
        personaDao.eliminar(personaDelete);

        // LISTAR PERSONAS
        List<Persona> personas = personaDao.seleccionar();

//        for (Persona persona : personas) {
//            System.out.println("persona = " + persona);
//        }
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
