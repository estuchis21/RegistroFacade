package registrofacade;

public class RegistroFacade {
    private ValidadorEstudiante validadorEstudiante;
    private VerificadorCurso verificadorCurso;
    private ProcesadorPago procesadorPago;
    private ActualizadorSistema actualizadorSistema;

    public RegistroFacade(ValidadorEstudiante vE, VerificadorCurso vC, ProcesadorPago pP, ActualizadorSistema aS) {
        this.validadorEstudiante = vE;
        this.verificadorCurso = vC;
        this.procesadorPago = pP;
        this.actualizadorSistema = aS;
    }

    public void registrarEstudiante(Estudiante estudiante, Curso curso, double monto) {
        if(validadorEstudiante.esValido(estudiante) && verificadorCurso.hayCuposDisponibles(curso)) {
            String resultadoPago = procesadorPago.procesarPago(estudiante, monto);
            String resultadoActualizacion = actualizadorSistema.actualizar(curso, estudiante);
            System.out.println(resultadoPago);
            System.out.println(resultadoActualizacion);
        } else {
            System.out.println("Registro fallido. Verifique los datos.");
        }
    }
}
