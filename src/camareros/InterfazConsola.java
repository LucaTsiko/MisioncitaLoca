package camareros;

import cocineros.GestionMisiones;

public class InterfazConsola {
    private GestionMisiones gestor;

    public InterfazConsola(GestionMisiones gestor) {
        this.gestor = gestor;
    }
    // mostrar menú
    // mostrar respuestas
    // pedir distintos tipos de datos
    // llamar a las distintas funcionalidades del gestor

    /**
     * Metodo que imprime la consola
     */
    public void iniciar(){
        System.out.println("CONSOLA");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Listar Misiones \n" +
                "2. Crear Mision \n" +
                "3. buscar Mision\n" +
                "\n 9. Eliminar Mision (solicita informacion)\n" +
                "\n 0. Salir");
        System.out.println("-----------------------------------------------");
    }
}
