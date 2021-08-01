import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Autor {
    private String nombre;
    List<Libro> arrayLibroAutor;


    public Autor(String nombre) {
        this.nombre = nombre;
        this.arrayLibroAutor = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libroAgregar)
    {
        this.arrayLibroAutor.add(libroAgregar);
    }
    
    public void imprimirLibros()
    {
        System.out.println("-------" + this.nombre + "-------");
        for(Libro l : this.arrayLibroAutor)
        {
            l.imprimirLibro();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Autor)) {
            return false;
        }
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre);
    }
}

