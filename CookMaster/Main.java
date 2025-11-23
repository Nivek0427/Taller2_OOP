public class Main {
    public static void main(String[] args) {

        System.out.println("=== CookMaster - Sistema de Recetas ===\n");

        LibroRecetas libro = LibroRecetas.getInstancia();

        // Crear POSTRE
        System.out.println("Creando receta de tipo: POSTRE");
        Receta r1 = RecetaFactory.crearReceta("POSTRE", "Tiramisú", 40);
        r1.agregarIngrediente(new Ingrediente("Café", 1, "taza"));
        r1.agregarIngrediente(new Ingrediente("Queso crema", 200, "g"));
        r1.agregarIngrediente(new Ingrediente("Bizcochos", 150, "g"));
        r1.agregarPaso(new Paso(1, "Mezclar ingredientes."));
        r1.agregarPaso(new Paso(2, "Montar el tiramisú."));
        r1.agregarPaso(new Paso(2, "Refrigerar."));
        System.out.println("→ Receta creada: " + r1.getNombre());
        System.out.println("→ Ingredientes añadidos: " + r1.ingredientes.size());
        System.out.println("→ Pasos añadidos: " + r1.pasos.size());
        libro.agregar(r1);
        System.out.println("Receta guardada en el Libro de Recetas.\n");

        // Crear BEBIDA
        System.out.println("Creando receta de tipo: BEBIDA");
        Receta r2 = RecetaFactory.crearReceta("BEBIDA", "Limonada Natural", 10);
        r2.agregarIngrediente(new Ingrediente("Limón", 2, "unidades"));
        r2.agregarIngrediente(new Ingrediente("Azúcar", 3, "cucharadas"));
        r2.agregarIngrediente(new Ingrediente("Agua", 1, "un vaso grande"));
        r2.agregarPaso(new Paso(1, "Mezclar agua y limón."));
        r2.agregarPaso(new Paso(2, "Agregar azúcar."));
        System.out.println("→ Receta creada: " + r2.getNombre());
        System.out.println("→ Ingredientes añadidos: " + r2.ingredientes.size());
        System.out.println("→ Pasos añadidos: " + r2.pasos.size());
        libro.agregar(r2);
        System.out.println("Receta guardada en el Libro de Recetas.\n");

        // Listado
        System.out.println("______________________________________");
        System.out.println("Listado de recetas registradas:");

        int i = 1;
        for (Receta r : libro.listar()) {
            System.out.println(i++ + ". " + r.getNombre() + " (" +
                    r.getTipo() + ") – Tiempo: " + r.getTiempoPreparacion() + " min");
        }

        System.out.println("______________________________________\n");

        System.out.println("Detalles del Libro de Recetas:");
        System.out.println("Total recetas almacenadas: " + libro.listar().size());
        System.out.println("Instancia del libro: OK (Singleton activo)");

        // Mostrar detalle de una receta específica
        r1.mostrarDetalle();

        System.out.println("¿Mostrar otra receta? (S/N)");

    }
}
