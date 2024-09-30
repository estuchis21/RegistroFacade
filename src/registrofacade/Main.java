package registrofacade;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases que el facade necesita
        ValidadorEstudiante validador = new ValidadorEstudiante();
        VerificadorCurso verificador = new VerificadorCurso();
        ProcesadorPago procesadorPago = new ProcesadorPago();
        ActualizadorSistema actualizadorSistema = new ActualizadorSistema();

        // Crear el facade con las dependencias necesarias
        RegistroFacade registroFacade = new RegistroFacade(validador, verificador, procesadorPago, actualizadorSistema);

        // Crear un estudiante y un curso de ejemplo
        Estudiante estudiante = new Estudiante("Esteban Alvarez", "43795516");
        Curso curso = new Curso("Data Science", 50); 

        // Intentar registrar al estudiante en el curso
        registroFacade.registrarEstudiante(estudiante, curso, 500.00);

        // Mensaje final
        System.out.println("Proceso de registro finalizado.");
    }
}
