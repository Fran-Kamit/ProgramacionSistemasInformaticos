package unidad08.ejHerencia.Controller;

import unidad08.ejHerencia.Class.Alumno;
import unidad08.ejHerencia.Class.Profesor;

import java.time.LocalDate;

public class Main {
    /*  Modelado de una Escuela:
      Dentro del contexto de una escuela, se solicita desarrollar un sistema de información que
    permita gestionar la información de las personas que forman parte de ella. Para ello,
    se ha definido una jerarquía de clases que incluye la clase principal Persona, la cual
    es heredada por las clases Profesor y Alumno.

    El ejercicio consiste en implementar estas clases en Java, siguiendo los siguientes requisitos:
      1. La clase Persona debe contener atributos comunes a profesores y alumnos, como el nombre,
        teléfono, dirección y nacionalidad. Además, debe incluir la fecha de nacimiento para calcular
        la edad y la opción de tener comedor.
      2. La clase Profesor extiende la clase Persona e incorpora características adicionales propias de
        los docentes, como el área de especialización y el nivel de experiencia.
      3. La clase Alumno también hereda de Persona y agrega atributos específicos relacionados con el curso,
        el aula y los detalles del tutor, incluyendo su nombre, teléfono y dirección.

      Se requiere implementar estas clases con sus respectivos métodos de acceso y construcción,
    así como también sobrescribir el método toString() para mostrar la información completa de cada objeto.

      Una vez implementadas las clases, se deberá crear instancias de profesores y alumnos para demostrar el
    funcionamiento del sistema de información.*/

    public static void main(String[] args) {

        Alumno a1=new Alumno();
        a1.setNombre("Maria Perez");
        a1.setTelefono("");//si no se lo pasamos por parametro sera null
        a1.setDireccion("Calle tal, numero3");
        a1.setNacionalidad("Española");
        //LocalDate f =LocalDate.of(2010,05,13);
        a1.setFechaNacimiento(LocalDate.of(2010,05,13));
        a1.setCurso("3");
        a1.setAula("A13");
        a1.setComedor(true);
        a1.setNombreTutor("Manuel Perez");
        a1.setTelefonoTutor("647138051");
        a1.setDireccionTutor("Calle tal, numero 3");
        a1.setEmailTutor("mp2@gmail.com");
        System.out.println(a1.toString());

        Alumno a2=new Alumno();
        a2.setNombre("Juan Keef");
        a2.setEmailTutor("mp2@gmail.com");
        if(a1.equals(a2)){
            System.out.println("El email ya existe.");
        }

        Alumno a3=new Alumno();
        a3.setNombre("Fernando Arias");

        System.out.println(a2.toString());
        System.out.println(a3.toString());

        Profesor p1=new Profesor();
        p1.setNombre("Lucia Perez");

        Profesor p2=new Profesor();
        p2.setNombre("Maria Alvaro");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}