public class RecetaFactory {

    public static Receta crearReceta(String tipo, String nombre, int tiempo) {
        switch (tipo.toUpperCase()) {
            case "POSTRE":
                return new Postre(nombre, tiempo, "Medio", true); 
            case "BEBIDA":
                return new Bebida(nombre, tiempo, true);
            case "PLATOFUERTE":
                return new PlatoFuerte(nombre, tiempo, 2);
            default:
                throw new IllegalArgumentException("Tipo de receta inválido.");
        }
    }
}
