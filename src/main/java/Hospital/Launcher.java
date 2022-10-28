package Hospital;

import java.util.Scanner;
public class Launcher {
    public static void main(String[] args) {
        Hospital.Launcher launcher = new Hospital.Launcher();
        launcher.inicializar();
    }
    public void inicializar() {
        Registro registro = new Registro();

        //Agregando personas a la lista
        registro.agregarPersona("Leo", "Roa", 19);
        registro.agregarPersona("Manuel", "Rodriguez", 70);
        registro.agregarPersona("Manolo", "Perez", 61);
        System.out.println("========= Lista de personas ==========");
        registro.mostrarPersonas();

        //buscar personas Mayores de 60 años.
        System.out.println("===============================");
        registro.Mayores60();

        //buscar personas por nombre sin discriminar de mayusculas y minusculas.
        System.out.println("===============================");
        registro.buscarPersona0("Leo");
    }
}