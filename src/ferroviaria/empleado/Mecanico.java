package ferroviaria.empleado;
/***
 * @author Carlos Alberto González Hernández
 */
public class Mecanico{

    private String nombre;
    private String telefono;
    private Especialidad especialidad;
    public static int totalMecanico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        totalMecanico++;
    }

    public void verInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\nNombre: \n\t"+nombre+
                "\nTeléfono: \n\t"+telefono+
                "\nEspecialidad: \n\t"+especialidad+
                "\n++++++++++++++++++++++++++++++++++++++++++++++++";
    }
}
