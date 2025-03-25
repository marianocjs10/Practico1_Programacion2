import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INICIO DEL PROGRAMA");
        while(true) {
            System.out.println("Elija el número de la Kata: 1 - 2 - 3 - 4 - 5... ó ingrese '0' para salir.");
            int kata=Integer.parseInt(input.nextLine());
            if(kata==1){
                System.out.println("----- Inicio de la Kata 1 -----");
                Estudiante estudiante = new Estudiante();
                System.out.println("Ingrese el nombre del alumno:");
                estudiante.setNombre(input.nextLine());
                System.out.println("Ingrese el apellido del alumno:");
                estudiante.setApellido(input.nextLine());
                System.out.println("Ingrese el curso del alumno:");
                estudiante.setCurso(input.nextLine());
                System.out.println("Ingrese la calificación del alumno:");
                estudiante.setCalificacion(Double.parseDouble(input.nextLine()));
                while (true) {
                    System.out.println("Elija la opción que desea realizar:\n" +
                            "1) Mostrar la información del estudiante.\n" +
                            "2) Subir la calificación del estudiante.\n" +
                            "3) Bajar la calificación del estudiante.\n" +
                            "4) Salir.");
                    int opcion = Integer.parseInt(input.nextLine());
                    if (opcion == 1) {
                        estudiante.mostrarInfo();
                    } else if (opcion == 2) {
                        estudiante.subirCalificacion();
                        estudiante.mostrarInfo();
                    } else if (opcion == 3) {
                        estudiante.bajarCalificacion();
                        estudiante.mostrarInfo();
                    } else if (opcion == 4) {
                        System.out.println("----- Fin de la Kata 1 -----");
                        break;
                    } else {
                        System.out.println("Opción incorrecta, intente de nuevo...");
                    }
                }
            } else if (kata==2) {
                System.out.println("----- Inicio de la Kata 2 -----");
                Mascota mascota = new Mascota();
                System.out.println("Ingrese el nombre de la mascota: ");
                mascota.setNombre(input.nextLine());
                System.out.println("Ingrese la especie de la mascota: ");
                mascota.setEspecie(input.nextLine());
                System.out.println("Ingrese la edad inicial de la mascota: ");
                mascota.setEdad(Integer.parseInt(input.nextLine()));
                mascota.mostrarInfo();
                while(true){
                    System.out.println("Elija la opción que desea realizar: \n"+
                            "1) Aumentar la edad en 1 año\n"+
                            "2) Salir");
                    int opcion = Integer.parseInt(input.nextLine());
                    if(opcion==1){
                        mascota.cumplirAnios();
                    } else if (opcion==2) {
                        System.out.println("----- Fin de la Kata 2 -----");
                        break;
                    }else {
                        System.out.println("Opción incorrecta. Intente de nuevo...");
                    }
                }

            } else if (kata==3) {
                System.out.println("----- Inicio de la Kata 3 -----");
                Libro libro = new Libro("La resistencia", "Sábato", 2000);
                libro.setAnioPublicacion(2027);
                libro.setAnioPublicacion(2010);
                libro.setAnioPublicacion(1890);
                System.out.println("Título: "+libro.getTitulo());
                System.out.println("Autor: "+libro.getAutor());
                System.out.println("Año de publicación: "+libro.getAnioPublicacion());
                System.out.println("----- Fin de la Kata 3 -----");
            } else if (kata==4) {
                Gallina gallina1 = new Gallina();
                Gallina gallina2 = new Gallina();
                System.out.println("Ingrese un ID para la Gallina 1: ");
                gallina1.setIdGallina(Integer.parseInt(input.nextLine()));
                System.out.println("Ingrese un ID para la Gallina 2: ");
                gallina2.setIdGallina(Integer.parseInt(input.nextLine()));
                gallina1.ponerHuevo();
                gallina1.ponerHuevo();
                gallina1.ponerHuevo();
                gallina2.ponerHuevo();
                gallina2.ponerHuevo();
                gallina1.envejecer();
                gallina2.envejecer();
                System.out.println("---------------");
                System.out.println("Gallina 1: ");
                gallina1.mostrarEstado();
                System.out.println("---------------");
                System.out.println("Gallina 2: ");
                gallina2.mostrarEstado();
                System.out.println("---------------");
            } else if (kata==5) {
                NaveEspacial nave1 = new NaveEspacial("StarShip",50);
                nave1.mostrarEstado();
                nave1.avanzar(60);
                nave1.recargarCombustible(40);
                nave1.avanzar(60);
                nave1.mostrarEstado();
                /*--------------------*/
                NaveEspacial nave2 = new NaveEspacial("Crew Dragon", 5);
                nave2.mostrarEstado();
                nave2.despegar();
                nave2.recargarCombustible(100);
                nave2.recargarCombustible(95);
                nave2.despegar();
                nave2.avanzar(40);
                nave2.mostrarEstado();
            } else if (kata==0) {
                System.out.println("FIN DEL PROGRAMA");
                break;
            } else {
                System.out.println("Opción Incorrecta. Intente de nuevo...");
            }
        }
    }
}