package ferroviaria.empleado;

import java.util.Date;

/***
 * @author Carlos Alberto González Hernández
 */
public class JefeDeEstacion{
    private String nombre;
    private String dni;
    private Date fechaNombramiento;
    public static int totalJefe;

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

    public Date getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(Date fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public JefeDeEstacion(String nombre, String dni, Date fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
        totalJefe++;
    }

    public void verInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\nNombre: \n\t"+nombre+
                "\nDni: \n\t"+dni+
                "\nFecha de Nombramiento: \n\t"+fechaNombramiento;
    }
}