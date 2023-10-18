import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gestor g = new Gestor();
        List<Cita> nuevasCitas = new ArrayList<>();
        List<Cita> citas = g.leerCSV("citas.csv");

        while(true){
            System.out.println("MENU");
            System.out.println("1. Generar nueva cita.");
            System.out.println("2. Mostrar catalogo disponible.");
            System.out.println("3. Salir");
            Scanner sc = new Scanner(System.in);  
            System.out.println("Elige la accion que quieras realizar: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    System.out.println("Ingrese los datos de la cita: ");
                    System.out.println("Ingrese el nombre del recurso: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la editorial: ");
                    String editorial = sc.nextLine();
                    System.out.println("Ingrese el genero del contenido: ");
                    String gen = sc.nextLine();
                    System.out.println("Ingrese el autor del contenido: ");
                    String aut = sc.nextLine();
                    System.out.println("Ingrese el formato en que se encuentra el contenido: ");
                    String tipo = sc.nextLine();
                    System.out.println("Ingrese el año: ");
                    int date = sc.nextInt();
                    Cita cita = new Cita(nombre, editorial, date, gen, aut, tipo);
                    nuevasCitas.add(cita);
                    g.guardarCSV("citas.csv", nuevasCitas);
                    break;

                case 2:
                    g.imprimirCitas(citas);
                    g.imprimirCitas(nuevasCitas);  
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida"); 
            }   
        }
    }
}   
