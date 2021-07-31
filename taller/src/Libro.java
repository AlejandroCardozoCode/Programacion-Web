public class Libro {
    private String titulo;
    private String descripcion;
    private int precio;
    private String autor;
    private int anio;
    
    public Libro(String titulo, String descripcion, int precio, String autor, int anio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}