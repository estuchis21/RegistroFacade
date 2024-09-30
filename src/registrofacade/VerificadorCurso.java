/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrofacade;

public class VerificadorCurso {
    public boolean hayCuposDisponibles(Curso curso) {
        // Verificar si el curso tiene cupos disponibles
        return curso.getCuposDisponibles() > 0;
    }
}
