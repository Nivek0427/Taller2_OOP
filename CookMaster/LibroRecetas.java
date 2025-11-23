import java.util.ArrayList;
import java.util.List;

public class LibroRecetas {
    private static LibroRecetas instancia;
    private List<Receta> recetas;

    private LibroRecetas() {
        recetas = new ArrayList<>();
    }

    public static LibroRecetas getInstancia() {
        if (instancia == null) {
            instancia = new LibroRecetas();
        }
        return instancia;
    }

    public void agregar(Receta r) {
        recetas.add(r);
    }

    public List<Receta> listar() {
        return recetas;
    }
}
