public class Cita {
    private String nombre;
    private String editorial;
    private int date;
    private String gen;
    private String aut;
    private String tipo;

    public Cita(String nombre, String editorial, int date, String gen, String aut, String tipo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.date = date;
        this.gen = gen;
        this.aut = aut;
        this.tipo = tipo;
    }

    public Cita(String linea, int i, int j) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Cita: " + aut + ".(" + date + "). " + nombre + ". " + editorial + ". " + gen + ". " + tipo;
    }
}
