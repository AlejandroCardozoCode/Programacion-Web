import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        List<Libro> arrayLibros = new ArrayList<Libro>();
        while (opcion != 4)
        {
            menu();
            opcion = input.nextInt(); 
            print("la opcione es " + String.valueOf(opcion));
       
            switch (opcion)
            {
                case 1:
                    crearLibro(arrayLibros);
                    for (Libro d: arrayLibros){
                        print(d.getTitulo());
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    print("Saliendo del sistema");
                    break;
                default:
                    print("Opcion no valida");
            }
        }
    }
    public static void menu()
    {
        print("MENU");
        print("1) Agregar un libro");
        print("2) Listar libros por autor");
        print("3) Detallar libro");
        print("4) Salir");

    }

    public static void print(String s)
    {
        System.out.println(s);
    }
    
    public static void crearLibro(List arregloLibros)
    {
        Scanner input = new Scanner(System.in);
        print("Ingrese el titulo del libro");
        String titulo = input.nextLine();
        print("Ingrese la descripcion del libro");
        String descripcion = input.nextLine();
        print("Ingrese el precio del libro");
        int precio = input.nextInt();
        print("Ingrese el autor del libro");
        String autor = input.nextLine();
        print("Ingrese el año del libro");
        int anio = input.nextInt();
    
        Libro libro = new Libro(titulo, descripcion, precio, autor,anio);
        arregloLibros.add(libro);
        
    }
}
