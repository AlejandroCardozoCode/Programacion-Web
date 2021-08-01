public class Libro {
    private String titulo;
    private String descripcion;
    private int precio;
    private String autor;
    private int anio;
    private int paginas = 0; 
    public Libro(String titulo, String descripcion, int precio, String autor, int anio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.autor = autor;
        this.anio = anio;
    }

    public void imprimirLibroDetallado()
    {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Precio: " + String.valueOf(this.precio));
        System.out.println("Año: " + this.anio);
        System.out.println("Paginas: " + this.paginas);
    }

    public void imprimirLibro()
    {
        System.out.println("Titulo: " + this.titulo);
    }

    public Boolean esLibro(String nombreComparar)
    {
        return this.titulo.equals(nombreComparar);
    }

    public void paginas(int numeroPaginas)
    {
        this.paginas = numeroPaginas;
    }
}