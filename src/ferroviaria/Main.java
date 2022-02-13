package ferroviaria;

import ferroviaria.empleado.Especialidad;
import ferroviaria.empleado.JefeDeEstacion;
import ferroviaria.empleado.Maquinista;
import ferroviaria.empleado.Mecanico;
import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;

import java.util.Calendar;
import java.util.GregorianCalendar;

/***
 * @author Carlos Alberto González Hernández
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("Simulamos una estación: creamos objetos de diversos tipos:");
        System.out.println("dos maquinistas");
        System.out.println("imprimimos los datos de los dos maquinistas");
        Maquinista maqPablo = new Maquinista("Pablo","l8746645d",1500.0, "AA" );
        Maquinista maqDoroti = new Maquinista("Doroti","b123531231F",1850.0, "AC" );
        maqPablo.verInfo();
        maqDoroti.verInfo();

        System.out.println("=========================================================");
        System.out.println("un mecánico de cada especialidad");
        System.out.println("imprimimos los datos de cada mecánico");
        Mecanico mecJacobo = new Mecanico("Jacobo","915558746",Especialidad.MOTOR);
        Mecanico mecJaime = new Mecanico("Jaime","98749623",Especialidad.ELECTRICIDAD);
        Mecanico mecJerico = new Mecanico("jerico","93587668",Especialidad.FRENOS);
        Mecanico mecJulio = new Mecanico("Julio","92557866",Especialidad.HIDRÁULICA);
        mecJacobo.verInfo();
        mecJaime.verInfo();
        mecJerico.verInfo();
        mecJulio.verInfo();

        System.out.println("=========================================================");
        System.out.println("Un jefe de estación");
        System.out.println("Imprimimos los datos del jefe de estación");
        JefeDeEstacion jefeGustavo = new JefeDeEstacion("Gustavo","j254786f",new GregorianCalendar(1987, Calendar.MARCH, 11).getTime());
        jefeGustavo.verInfo();

        System.out.println("=========================================================");
        System.out.println("Una locomotora");
        System.out.println("imprimimos los datos de la locomotora");
        Locomotora locomotora = new Locomotora("LM5896",2000,1895, mecJaime);
        locomotora.verInfo();

        System.out.println("=========================================================");
        System.out.println("Creamos un tren con la locomotora que acabamos de crear");
        Tren chuchu = new Tren(locomotora);
        chuchu.verInfo();

        System.out.println("=========================================================");
        System.out.println("Añadimos 6 vagones al tren (nos dirá que el último no se puede)");
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();

/*        System.out.println("=========================================================");
        System.out.println("Añadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();
        chuchu.anadirVagon();*/

        System.out.println("=========================================================");
        System.out.println("Asignamos uno de los maquinistas al tren creado");
        chuchu.setMaquinista(maqDoroti);
        System.out.println("Maquinista asignado:");
        chuchu.getMaquinista().verInfo();

        System.out.println("=========================================================");
        System.out.println("Mostramos el número de vagones del tren");
        System.out.println("Vagones del tren: "+chuchu.getVagon());

        System.out.println("=========================================================");
        System.out.println("Mostramos los datos del tren creado");
        chuchu.verInfo();

        System.out.println("=========================================================");
        System.out.println("Quitamos un vagón");
        chuchu.eliminarVagon();

        System.out.println("=========================================================");
        System.out.println("mostramos el número de vagones del tren");
        System.out.println("Vagones del tren: "+chuchu.getVagon());

        System.out.println("=========================================================");
        System.out.println("Finalmente, contamos todos los elementos que tenemos en la estación");
        System.out.println("Mi estación se compone de");
        System.out.println("Total de Trenes:\n\t"+Tren.totalTren+
                           "\nTotal de Locomotoras:\n\t"+Locomotora.totalLocomotora+
                           "\nTotal de Jefes:\n\t"+JefeDeEstacion.totalJefe+
                           "\nTotal de Maquinistas:\n\t"+Maquinista.totalMaquinista+
                           "\nTotal de Mecánicos:\n\t"+Mecanico.totalMecanico);
    }
}
