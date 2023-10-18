import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gestor {
    public List<Cita> leerCSV(String nombreArchivo) {
        List<Cita> citas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6) {
                    String nombre = (partes[0]);
                    String editorial =(partes[1]);
                    int date = (Integer.parseInt(partes[2]));
                    String gen = (partes[3]);
                    String aut = (partes[4]);
                    String tipo = (partes[5]);
                    Cita cita = new Cita(nombre, editorial, date, gen, aut, tipo);
                    citas.add(cita);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return citas;
    }

    public static void imprimirCitas(List<Cita> citas) {
        System.out.println("Citas actuales:");
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }


    public static void guardarCSV(String nombreArchivo, List<Cita> nuevasCitas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            for (Cita cita : nuevasCitas) {
                String linea = String.join(",", cita.getNombre(), cita.getEditorial(), String.valueOf(cita.getDate()), cita.getGen(), cita.getAut(), cita.getTipo());
                writer.write( linea + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
