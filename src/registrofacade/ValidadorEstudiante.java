/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrofacade;

public class ValidadorEstudiante {
    public boolean esValido(Estudiante estudiante) {
        // Validar si el estudiante es válido (por ejemplo, verificar si su ID es correcto)
        return estudiante != null && !estudiante.getId().isEmpty();
    }
}
