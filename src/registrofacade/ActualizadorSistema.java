/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrofacade;

public class ActualizadorSistema {
    public String actualizar(Curso curso, Estudiante estudiante) {
        // Actualizar el sistema para registrar al estudiante en el curso
        curso.reducirCupo();
        return "El estudiante " + estudiante.getNombre() + " ha sido registrado en el curso " + curso.getNombre();
    }
}

