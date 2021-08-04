//Diego Alejandro Cardozo Rojas 

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.time.Year;

// Clausulas de guarda: programas sin else
// Tell don't ask: decirle a las clases lo que queremos hacer y no preguntar, no usar set no get
// Ley de demeter: no hablar con extraños, no hacer cadenas de metodos

public class Main {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        List<Libro> arrayLibros = new ArrayList<Libro>();
        List<Autor> arrayAutores = new ArrayList<Autor>();
        while (opcion != 4)
        {
            menu();
            opcion = input.nextInt(); 
       
            switch (opcion)
            {
                case 1:
                    crearLibro(arrayLibros, arrayAutores);
                    break;
                case 2:
                    imprimirAutores(arrayAutores);
                    break;
                case 3:
                    detallarLibro(arrayLibros);
                    break;
                case 4:
                    print("Saliendo del sistema");
                    break;
                default:
                    print("Opcion no valida");
            }
        }
    }

    public static void detallarLibro(List<Libro> arrayLibros) 
    {
        Scanner input = new Scanner(System.in);
        print("Ingrese el nombre del libro");
        String nombreLibro = input.nextLine();

        for(Libro l : arrayLibros)
        {
            if(l.esLibro(nombreLibro))
            {
                print("Ingrese el numero de paginas que se le van a asignar al libro");
                int numeroPaginas = input.nextInt();
                if(numeroPaginas < 0 || numeroPaginas >1500)
                {
                    print("Numero de paginas no valido, debe ser mayor a 0 y menor a 1500");
                }
                l.paginas(numeroPaginas);
                l.imprimirLibroDetallado();
                return;
            }
            print("El libro no se encuentra en la base de datos");
        }
    }

    public static void imprimirAutores(List<Autor> arrayAutores)
    {
        Scanner input = new Scanner(System.in);
        print("Ingrese el nombre del Artista");
        String autor = input.nextLine();

        for(Autor actual: arrayAutores)
        {
           if(actual.esAutor(autor)) 
           {
               actual.imprimirLibros();
               return;
           }
           print("El Autor no existe en la base de datos");
           return;
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
    
    public static void crearLibro(List<Libro> arregloLibros, List<Autor> arregloAutores)
    {
        Scanner input = new Scanner(System.in);
        print("Ingrese el titulo del libro");
        String titulo = input.nextLine();
        if(titulo.length() < 5 || titulo.length() > 100)
        {
            print("El titulo no es valido para el sistema, debe ser mayor a 5 caracteres y menos a 100");
            return;
        }
        print("Ingrese la descripcion del libro");
        String descripcion = input.nextLine();
        if(descripcion.length() > 200)
        {
            print("La descripcion no puede tener mas de 200 caracteres");
            return;
        }
        print("Ingrese el Nombre del autor del libro");
        String autorN = input.nextLine();
        print("Ingrese el Apellido del autor");
        String autorA = input.nextLine();
        if(autorN.length() == 0 || autorA.length() == 0)
        {
            print("Nombre o apellido del autor no validos");
            return;
        }
        String autor = autorN + " " + autorA;

        print("Ingrese el precio del libro");
        double precio = input.nextDouble();
        if(precio < 10000)
        {
            print("El precio debe ser positivo y mayor a 10000");
            return;
        }
        print("Ingrese el año del libro");
        int anio = input.nextInt();
        String anioS = String.valueOf(anio);
        if(anioS.length() < 4 || anio > Year.now().getValue())
        {
            print("El año no es valido para el sistema");
            return;
        }
        Libro libro = new Libro(titulo, descripcion, (int)precio, autor,anio);
        int indiceLibro = arregloLibros.indexOf(libro);
        if(indiceLibro != -1)
        {
            print("El libro ya se encuentra en la base de datos");
            return;
        }
        arregloLibros.add(libro);

        Autor autorC = new Autor(autor);
        int indiceAutor = arregloAutores.indexOf(autorC);
        if(indiceAutor == -1)
        {
            autorC.agregarLibro(libro);
            arregloAutores.add(autorC);
            return;
        }

        autorC = arregloAutores.get(indiceAutor);
        autorC.agregarLibro(libro);
        arregloAutores.set(indiceAutor, autorC);
    }
}