package ferroviaria.maquinaria;

import ferroviaria.empleado.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;
/***
 * @author Carlos Alberto González Hernández
 */
public class Tren{
    protected Locomotora locomotora;
    protected ArrayList<Vagon> vagon;
    protected Maquinista maquinista;
    public static int totalTren;
    public static Scanner sc = new Scanner(System.in);

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public int getVagon(){
        return (vagon!=null?vagon.size():0);
    }

    public void setVagon(ArrayList<Vagon> vagon) {
        this.vagon = vagon;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public void verInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Locomotora:\n"+locomotora+
                "\nMaquinista:\n"+(maquinista!=null?maquinista:"Sin maquinista")+
                "\nVagones:\n\t"+(vagon!=null?vagon:"Sin vagones");

    }

    public Tren(Locomotora locomotora) {
        this.locomotora = locomotora;
        totalTren++;
    }

    public void anadirVagon(){
        if (getVagon()<5){
            if (vagon==null){
                vagon = new ArrayList<Vagon>();
            }
            vagon.add(crearVagon());
        }else {
            System.out.println("***************************************");
            System.out.println("* No se puede añadir ningún vagón más *");
            System.out.println("***************************************");
        }
    }

    private Vagon crearVagon(){
        int id= totalTren+getVagon();
        Double cargaMaxima=cargaMaxima();
        Double cargaActual=0.0;
        TipoMercancia tipoMercancia=elegirMercancia();

        return new Vagon(id,cargaMaxima,cargaActual,tipoMercancia);
    }

    private Double cargaMaxima() {
        System.out.println("Escribe la carga máxima del vagón: ");
        Double maxCarga = sc.nextDouble();
        sc.nextLine();
        return maxCarga;
    }

    private TipoMercancia elegirMercancia() {
        do {
            System.out.println("Elige el tipo de mercancía que lleva el vagón: ");
            System.out.println("""
                1. PERECEDERA
                2. NOPERECEDERA
                3. FRÁGIL
                4. PELIGROSA
                5. DIMENSIONAL
                """);
            int opcion =sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1 -> {
                    return TipoMercancia.PERECEDERA;
                }
                case 2 -> {
                    return TipoMercancia.NOPERECEDERA;
                }
                case 3 -> {
                    return TipoMercancia.FRAGIL;
                }
                case 4 -> {
                    return TipoMercancia.PELIGROSA;
                }
                case 5 -> {
                    return TipoMercancia.DIMENSIONAL;
                }
                default -> System.out.println("Selecciona una opción correcta");
            }
        }while (true);
    }

    public void eliminarVagon(){
        vagon.remove(vagon.get(vagon.size() - 1));
    }

}
