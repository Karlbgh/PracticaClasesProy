package ferroviaria.maquinaria;

import ferroviaria.empleado.Mecanico;
/***
 * @author Carlos Alberto González Hernández
 */
public class Locomotora{

    protected String matricula;
    protected int potencia;
    protected int anyoFabricacion;
    protected Mecanico mecanico;
    public static int totalLocomotora;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Locomotora(String matricula, int potencia, int anyoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyoFabricacion = anyoFabricacion;
        this.mecanico = mecanico;
        totalLocomotora++;
    }

    public void verInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\nMatrícula: \n\t"+matricula+
                "\nPotencia: \n\t"+potencia+
                "\nAño de Fabricación: \n\t"+anyoFabricacion+
                "\nMecánico Asignado: \n"+mecanico;
    }
}