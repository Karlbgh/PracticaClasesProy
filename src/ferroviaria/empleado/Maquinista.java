package ferroviaria.empleado;

/***
 * @author Carlos Alberto González Hernández
 */
public class Maquinista {

    private String nombre;
    private String dni;
    private Double sueldo;
    private String rango;
    public static int totalMaquinista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public Maquinista(String nombre, String dni, Double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
        totalMaquinista++;
    }

    public void verInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\nNombre: \n\t"+nombre+
                "\nDni: \n\t"+dni+
                "\nSueldo: \n\t"+sueldo+
                "\nRango: \n\t"+rango;
    }
}

