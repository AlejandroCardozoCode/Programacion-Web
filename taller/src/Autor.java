public class Autor {
    private String nombre;
    Libro[] arrayLibros;


    public Autor(String nombre, Libro[] arrayLibros) {
        this.nombre = nombre;
        this.arrayLibros = arrayLibros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getArrayLibros() {
        return this.arrayLibros;
    }

    public void setArrayLibros(Libro[] arrayLibros) {
        this.arrayLibros = arrayLibros;
    }

}

