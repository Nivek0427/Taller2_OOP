public class Postre extends Receta {
    private String nivelDulce;
    private boolean frio;

    public Postre(String nombre, int tiempo, String nivelDulce, boolean frio) {
        super(nombre, tiempo);
        this.nivelDulce = nivelDulce;
        this.frio = frio;
    }

    public String getNivelDulce() { return nivelDulce; }
    public boolean isVegetariano() { return frio; }

    @Override
    public String getTipo() {
        return "Postre";
    }
}
