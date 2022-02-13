package ferroviaria.maquinaria;
/***
 * @author Carlos Alberto González Hernández
 */
class Vagon{
    protected int id;
    protected Double cargaMaxima;
    protected Double cargaActual;
    protected TipoMercancia tipoMercancia;
    public static int totalVagon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(Double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public TipoMercancia getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(TipoMercancia tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    public Vagon(int id, Double cargaMaxima, Double cargaActual, TipoMercancia tipoMercancia) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
        totalVagon++;
    }

    public void verInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\n++++++++++++++++++++++++++++++++++++++++++++++++" +
                "\nId: \n\t"+id+
                "\ncarga máxima: \n\t"+cargaMaxima+
                "\nCarga actual: \n\t"+cargaActual+
                "\nTipo de Mercancía: \n\t"+tipoMercancia;
    }
}
