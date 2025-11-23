public class PlatoFuerte extends Receta {
    private int porcion;

    public PlatoFuerte(String nombre, int tiempo, int porcion) {
        super(nombre, tiempo);
        this.porcion = porcion;
    }

    @Override
    public String getTipo() {
        return "PlatoFuerte";
    }
}
