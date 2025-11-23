public class Bebida extends Receta {
    private boolean fria;

    public Bebida(String nombre, int tiempo, boolean fria) {
        super(nombre, tiempo);
        this.fria = fria;
    }

    @Override
    public String getTipo() {
        return "Bebida";
    }
}
