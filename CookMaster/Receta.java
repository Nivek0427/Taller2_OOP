import java.util.ArrayList;
import java.util.List;

public abstract class Receta {
    protected String nombre;
    protected int tiempoPreparacion;
    protected List<Ingrediente> ingredientes;
    protected List<Paso> pasos;

    public Receta(String nombre, int tiempoPreparacion) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = new ArrayList<>();
        this.pasos = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente i) {
        ingredientes.add(i);
    }

    public void agregarPaso(Paso p) {
        pasos.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public abstract String getTipo();
    
    public void mostrarDetalle() {
    System.out.println("\n=== Detalle de Receta ===\n");

    System.out.println("Nombre: " + nombre);
    System.out.println("Tipo: " + getTipo());
    System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min\n");

    // Ingredientes
    System.out.println("Ingredientes (" + ingredientes.size() + "):");
    int n = 1;
    for (Ingrediente i : ingredientes) {
        System.out.println("  " + (n++) + ") " + i.getNombre() + "," +
                i.getCantidad() + " " + i.getUnidad());
    }

    // Pasos
    System.out.println("\nPasos (" + pasos.size() + "):");
    for (Paso p : pasos) {
        System.out.println("  " + p.getNumero() + ". " + p.getDescripcion());
    }

    // Atributos extra según tipo
    System.out.println("\nEtiquetas / Atributos adicionales:");

    if (this instanceof Postre) {
        Postre p = (Postre) this;
        System.out.println("Nivel de dulce: " + p.getNivelDulce());
        System.out.println("Vegetariano: " + (p.isVegetariano() ? "Sí" : "No"));
    }

    System.out.println("\n--------------------------------------");
}

}
