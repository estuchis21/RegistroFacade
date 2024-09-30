/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrofacade;

public class ProcesadorPago {
    public String procesarPago(Estudiante estudiante, double monto) {
        // Procesar el pago del estudiante
        System.out.println("Pago de $" + monto + " procesado para el estudiante " + estudiante.getNombre());
        return "Pago exitoso";
    }
}
